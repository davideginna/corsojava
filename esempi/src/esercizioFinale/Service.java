package esercizioFinale;

import java.util.List;

public interface Service {
    /**
     * metodo per rimpieri il catalogo di prodotti all'avvio dell'applicativo
     *
     * @return ritorna una lista di prodotti
     */
    List<Prodotto> riempiCatalogo();

    /**
     * metodo per stampare azioni di login
     */
    void stampaLogin();

    /**
     * metodo per stampare il catalogo dei prodotti
     */
    void stampaCatalogo(List<Prodotto> catalogo);

    /**
     * metodo per stampare il carrello dei prodotti
     */
    void stampaCarrello(List<Prodotto> carrello);

    /**
     * metodo per stampare l'ordine dei prodotti
     */
    void stampaOrdine(List<Prodotto> ordine);

    /**
     * metodo per stampare la lunghezza del catalogo dei prodotti
     */
    void stampaLunghezzaCatalogo(List<Prodotto> catalogo);

    /**
     * metodo per stampare la lunghezza del carrello dei prodotti
     */
    void stampaLunghezzaCarrello(List<Prodotto> carrello);

    /**
     * metodo per stampare la lunghezza dell'ordine dei prodotti
     */
    void stampaLunghezzaOrdine(List<Prodotto> ordine);
}


