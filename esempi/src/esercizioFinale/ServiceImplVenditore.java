package esercizioFinale;

import java.util.Scanner;

public class ServiceImplVenditore implements ServiceVenditore {

    public void stamaAzioni() {
        System.out.println("=== Azioni Venditore ===\n" +
                "0 - aggiungi prodotto\n" +
                "1 - cancella prodotto\n" +
                "2 - lista prodotti\n" +
                "3 - lista ordini\n" +
                "4 - torna alla lista di scelta profilo\n" +
                "5 - chiudi"
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
