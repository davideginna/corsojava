package esercizioFinale;

import java.util.List;

public interface Service {
    /**
     * metodo per rimpieri il catalogo di prodotti all'avvio dell'applicativo
     *
     * @return ritorna una lista di prodotti
     */
    List<Prodotto> riempiCatalogo() ;

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
}


