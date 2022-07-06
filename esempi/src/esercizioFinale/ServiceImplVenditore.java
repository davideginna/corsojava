package esercizioFinale;

import java.util.Scanner;

public class ServiceImplVenditore implements ServiceVenditore {

    public void stamaAzioniVenditore() {
        System.out.println("=== Azioni Venditore ===\n" +
                "0 - aggiungi prodotto\n" +
                "1 - cancella prodotto\n" +
                "2 - lista prodotti\n" +
                "3 - lista ordini\n" +
                "4 - torna alla lista di scelta profilo\n" +
                "5 - chiudi"
        );
    }

    public void azioniVenditore() {
        int sceltaVenditore = -1;
        Scanner scannerVenditore = new Scanner(System.in);
        while (sceltaVenditore != 5) {
            stamaAzioniVenditore();
            System.out.print("inserisci valore: ");
            sceltaVenditore = scannerVenditore.nextInt();
            switch (sceltaVenditore) {
                case 0:
                    break;
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Scelta non valida, inserire 0, 1, 2, 3, 4 o 5");
                    break;
            }
        }
    }
}
