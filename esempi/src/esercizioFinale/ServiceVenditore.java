package esercizioFinale;

public interface ServiceVenditore {
    /**
     * metodo per stampare azioni venditore
     */
    void stamaAzioni();

    /**
     * aggiunta prodotto in catalogo
     * aggiungere un prodotto di nome dizionario con codice 006 e prezzo 35 e peso 3
     */
    void aggiungiProdotto();

    /**
     * cancellare un prodotto nel catalogo
     */
    void cancellaProdotto();

    /**
     * elenco di prodotti nel catalogo
     */
    void listaProdotti();

    /**
     *
     */
    void listaOrdini();

    /**
     * totale costo merce in catalogo
     */
    void prodottoMaxCostoInCatalogo();

    /**
     * totale costo prodotti in specifico ordine
     */
    void prodottoMaxCostoInOrdine();

    /**
     * invio ordine al cliente
     */
    void inviaOrdine();

    /**
     * sconto 10% a prodotti in uno specifico ordine
     */
    void scontoOrdine10();

    /**
     * sconto 50% a prodotti in catalogo
     */
    void saldi50Catalogo();
}
