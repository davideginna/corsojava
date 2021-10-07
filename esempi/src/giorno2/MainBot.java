package giorno2;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class MainBot {

    /*
    es0
        bot che mi risponde alle domande:
            0 - come stai?
            1 - che tempo fa?
            2 - che ore sono?
            3 - ciao ciao (exit)
        bot in loop
     */

    public static void main(String[] args) {
        System.out.println("Avvio bot simpatico");
        boolean terminato = false;
        while (!terminato) {
            //scelte
            System.out.println("0 - come stai?\n" +
                    "1 - che tempo fa?\n" +
                    "2 - che giorno è?\n" +
                    "3 - ciao ciao (exit)\n"
            );
            //input da tastiera
            Scanner scanner = new Scanner(System.in);  // Create a Scanner object
            System.out.println("fai la tua scelta");

            String scelta = scanner.nextLine();  // Read user input
            System.out.println("scelta: " + scelta);  // Output user input

           /* if (scelta.equals("0")) {
                System.out.println("io sto bene fatti gli affari tuoi");
            }
            if (scelta.equals("1")) {
                System.out.println("guarda fuori");
            }
            if (scelta.equals("2")) {
                DateFormat df =
                        DateFormat.getDateInstance(DateFormat.DATE_FIELD, Locale.ITALY);
                System.out.println(df.format(new Date()));
            }
            if (scelta.equals("3")) {
                System.out.println("bona");
                terminato = true;
            }
*/
            switch (scelta) {
                case "0":
                    stampa("io sto bene fatti gli affari tuoi");
                    break;
                case "1":
                    stampa("guarda fuori");
                    break;
                case "2":
                    stampa(getDateFormat().format(new Date()));
                    break;
                case "3":
                    stampa("bona");
                    terminato = true;
                    break;
                default:
                    stampa("comando non presente");
                    break;
            }

            System.out.println("--------------------------------------");
        }
    }

    private static DateFormat getDateFormat() {
        return DateFormat.getDateInstance(DateFormat.DATE_FIELD, Locale.ITALY);
    }

    private static void stampa(Object o) {
        System.out.println(o);
    }
}
