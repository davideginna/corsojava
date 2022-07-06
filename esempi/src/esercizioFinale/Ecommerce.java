package esercizioFinale;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class Ecommerce {

    /*
     * implementare un ecommerce nel quale é possibile autenticarsi come venditore o come cliente.
     *
     * come venditore le azioni disponili sono:
     * - aggiungi prodotto
     * - cancella prodotto
     * - lista prodotti in catalogo
     * - lista ordini
     * - invia ordine
     * - prodotto piú costoso nel catalogo
     * - prodotto piú costoso nell'ordine
     * - applica sconto a ogni ordine del 10%
     * - saldi del 50% su tutto il catalogo
     *
     *
     * come cliente le azioni disponibili sono:
     * - visualizza prodotti
     * - aggiungi prodotto al carrello
     * - svuota carrello da tutti i prodotti
     * - rimuovi prodotto dal carrello
     * - invia ordine dei prodotti presenti nel carrello
     * - prodotto piú costoso nell'ordine
     * - prodotto piú pesante nell'ordine
     * - totale costo carrello
     * - totale peso carrello
     *
     *
     * Funzionamento
     * Una volta avviato il sistema viene visualizzata una scelta:
     *
     * 0 - accesso come venditore
     * 1 - accesso come cliente
     * 2 - chiudi
     *
     * se si seleziona il 0 - accesso come venditore, il sistema presenta le seguenti scelte:
     * 0 - aggiungi prodotto
     * 1 - cancella prodotto
     * 2 - lista prodotti
     * 3 - lista ordini
     * 4 - invia ordine
     * 5 - prodotto piú costoso nel catalogo
     * 6 - prodotto piú costoso nell'ordine
     * 7 - applica sconto a ogni prodotto nell'ordine del 10%
     * 8 - saldi 50% su tutto il catalogo
     * 9 - torna alla lista di scelta profilo
     *
     * se si seleziona il 1 - accesso come cliente, il sistema presenta le seguenti scelte:
     * 0 - visualizza prodotti
     * 1 - aggiungi prodotto al carrello
     * 2 - svuota carrello da tutti i prodotti
     * 3 - rimuovi prodotto dal carrello
     * 4 - invia ordine dei prodotti presenti nel carrello
     * 5 - totale costo carrello
     * 6 - totale peso carrello
     * 7 - torna alla lista di scelta profilo
     *
     * Una volta effettuata l'azione per il venditore o il cliente, il sistema ripresenta la lista delle azioni
     * Una volta effettuata l'azione il sistema ripresenta il menu del profilo in atto
     * Accedendo come cliente il sistema mostra subito i prodotti nel carrello e poi la lista delle azioni
     * Accedendo come venditore il sistema mostra subito i prodotti nell'ordine e poi la lista delle azioni
     * il venditore puó effettuare piú ordini
     *
     * Implementare i metodi mancanti
     * Motivare eventuali metodi aggiuntivi e cambiamenti
     *
     * bonus1: l'accesso alla piattaforma da parte del venditore e cliente é fatto con user e password
     */

    public static List<Prodotto> catalogoProdotti = new ArrayList<>();
    public static List<Prodotto> carrelloProdotti = new ArrayList<>();
    public static List<Prodotto> ordineProdotti = new ArrayList<>();
    public static ServiceVenditore serviceVenditore = new ServiceImplVenditore();
    public static ServiceCliente serviceCliente = new ServiceImplCliente();

    public static void main(String[] args) {
        Service service = new ServiceImpl();


        // set catalogo prodotti
        System.out.println("=== INIZIO ===");


        catalogoProdotti = service.riempiCatalogo();
        service.stampaCatalogo(catalogoProdotti);

        int scelta = -1;
        Scanner scannerProfili = new Scanner(System.in);
        while (scelta != 2) {
            service.stampaLogin();
            System.out.print("inserisci valore: ");
            scelta = scannerProfili.nextInt();
            switch (scelta) {
                case 0:
                    System.out.println("Benvenuto venditore");
                    azioniVenditore();
                    break;
                case 1:
                    System.out.println("Benvenuto cliente");
                    azioniCliente();
                    break;
                case 2:
                    System.out.println("Ciao ciao!!");
                    break;
                default:
                    System.out.println("Scelta non valida, inserire 0, 1 o 2");
                    break;
            }
        }
    }

    /**
     * azioni del venditore
     */
    public static void azioniVenditore() {
        int scelta = -1;
        Scanner scannerVenditore = new Scanner(System.in);
        while (scelta != 9) {
            serviceVenditore.stamaAzioni();
            System.out.print("inserisci valore: ");
            scelta = scannerVenditore.nextInt();
            switch (scelta) {
                case 0:
                    System.out.println("aggiungi prodotto");
                    serviceVenditore.aggiungiProdotto();
                    break;
                case 1:
                    System.out.println("cancella prodotto");
                    serviceVenditore.cancellaProdotto();
                    break;
                case 2:
                    System.out.println("lista prodotti in catalogo");
                    serviceVenditore.listaProdotti();
                    break;
                case 3:
                    System.out.println("lista ordini");
                    serviceVenditore.listaOrdini();
                    break;
                case 4:
                    System.out.println("invia ordine");
                    serviceVenditore.inviaOrdine();
                    break;
                case 5:
                    System.out.println("prodotto piú costoso nel catalogo");
                    serviceVenditore.prodottoMaxCostoInCatalogo();
                    break;
                case 6:
                    System.out.println("prodotto piú costoso nell'ordine x");
                    serviceVenditore.prodottoMaxCostoInOrdine();
                    break;
                case 7:
                    System.out.println("applica sconto a ogni prodotto nell'ordine x del 10%");
                    serviceVenditore.scontoOrdine10();
                    break;
                case 8:
                    System.out.println("saldi 50% su tutto il catalogo");
                    serviceVenditore.saldi50Catalogo();
                    break;
                case 9:
                    System.out.println("LogOut");
                    break;
                default:
                    System.out.println("Scelta non valida, inserire 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 o 10");
                    break;
            }
        }
    }

    /**
     * azioni del cliente
     */
    private static void azioniCliente() {
        serviceCliente.stamaAzioni();
    }

}
