package esercizioFinale;

import java.util.Scanner;

public class ServiceImplVenditore implements ServiceVenditore {

    public void stamaAzioni() {
        System.out.println("=== Azioni Venditore ===\n" +
                "0 - aggiungi prodotto\n" +
                "1 - cancella prodotto\n" +
                "2 - lista prodotti in catalogo\n" +
                "3 - lista ordini\n" +
                "4 - invia ordine\n" +
                "5 - prodotto piú costoso nel catalogo\n" +
                "6 - prodotto piú costoso nell'ordine x\n" +
                "7 - applica sconto a ogni prodotto nell'ordine x del 10%\n" +
                "8 - saldi 50% su tutto il catalogo\n" +
                "9 - logout"
        );
    }

    @Override
    public void aggiungiProdotto() {

    }

    @Override
    public void cancellaProdotto() {

    }

    @Override
    public void listaProdotti() {

    }

    @Override
    public void listaOrdini() {

    }

    @Override
    public void prodottoMaxCostoInCatalogo() {

    }

    @Override
    public void prodottoMaxCostoInOrdine() {

    }

    @Override
    public void inviaOrdine() {

    }

    @Override
    public void scontoOrdine10() {

    }

    @Override
    public void saldi50Catalogo() {

    }


}
