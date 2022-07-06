package esercizioFinale;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Ecommerce {

    /*
     * implementare un ecommerce nel quale é possibile autenticarsi come venditore o come cliente.
     *
     * come venditore le azioni disponili sono:
     * - aggiungi prodotto
     * - cancella prodotto
     * - lista prodotti
     * - lista ordini
     *
     * come cliente le azioni disponibili sono:
     * - visualizza prodotti
     * - aggiungi prodotto al carrello
     * - svuota carrello da tutti i prodotti
     * - rimuovi prodotto dal carrello
     * - invia ordine dei prodotti presenti nel carrello
     *
     * bonus: l'accesso alla piattaforma da parte del venditore e cliente é fatto con user e password
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
     * 4 - torna alla lista di scelta profilo
     * 5 - chiudi
     *
     * se si seleziona il 1 - accesso come cliente, il sistema presenta le seguenti scelte:
     * 0 - visualizza prodotti
     * 1 - aggiungi prodotto al carrello
     * 2 - svuota carrello da tutti i prodotti
     * 3 - rimuovi prodotto dal carrello
     * 4 - invia ordine dei prodotti presenti nel carrello
     * 5 - torna alla lista di scelta profilo
     * 6 - chiudi
     *
     * Una volta effettuata l'azione per il venditore o il cliente, il sistema ripresenta la lista delle azioni
     *
     */

    public static List<Prodotto> catalogoProdotti = new ArrayList<>();


    public static void main(String[] args) {
        Service service = new ServiceImpl();
        ServiceVenditore serviceVenditore = new ServiceImplVenditore();
        ServiceCliente serviceCliente = new ServiceImplCliente();

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
                    serviceVenditore.azioniVenditore();
                    break;
                case 1:
                    System.out.println("Benvenuto cliente");
                    serviceCliente.stamaAzioniCliente();
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


}
