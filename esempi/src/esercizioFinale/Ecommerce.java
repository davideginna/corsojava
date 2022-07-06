package esercizioFinale;


import java.util.ArrayList;
import java.util.List;

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
     * Una volta avviato il sistema
     */

    public static List<Prodotto> catalogoProdotti = new ArrayList<>();


    public static void main(String[] args) {
        Service service = new ServiceImpl();

        // set catalogo prodotti
        System.out.println("=== INIZIO ===");


        catalogoProdotti = service.riempiCatalogo();
        service.stampaCatalogo(catalogoProdotti);

    }
}
