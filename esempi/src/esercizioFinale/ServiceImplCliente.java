package esercizioFinale;

public class ServiceImplCliente implements ServiceCliente {

    @Override
    public void stamaAzioniCliente() {
        System.out.println("=== Azioni cliente ===\n" +
                "0 - visualizza prodotti\n" +
                "1 - aggiungi prodotto al carrello\n" +
                "2 - svuota carrello da tutti i prodotti\n" +
                "3 - rimuovi prodotto dal carrello\n" +
                "4 - invia ordine dei prodotti presenti nel carrello\n" +
                "5 - torna alla lista di scelta profilo\n" +
                "6 - chiudi"
        );
    }
}
