package esercizioFinale;

public interface ServiceCliente {
    /**
     * metodo per stampare azioni cliente
     */
    void stamaAzioni();

    /**
     * elenco di prodotti nel catalogo
     */
    void listaProdotti();

    /**
     * aggiungi prodotto al carrello
     */
    void aggiungiProdottoCarrello();

    /**
     * rimuovi prodotto nel carrello
     */
    void rimuoviProdottoCarrello();

    /**
     * svuota carrello
     */
    void svuotaCarrello();

    /**
     * invia ordine a venditore
     */
    void inviaOrdine();

    /**
     * totale costo prodotti nel carrello
     */
    void totaleCostoCarrello();

    /**
     * totale peso prodotti nel carrello
     */
    void totalePesoCarrello();

}
