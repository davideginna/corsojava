package finale;

import java.util.Random;
import java.util.Scanner;

public class MainFinale {

    public static int dim = -1;
    public static int comando = -1;

    public static void main(String[] args) {
        print("Avvio partita...");
        Matrice matrice = startGame();

        do {
            try {
                print("===================================\n" +
                        "Inserisci il comando\n" +
                        "0 - esci\n" +
                        "1 - colpisci nave\n" +
                        "2 - stampa griglia\n" +
                        "3 - ricomincia partita da zero\n" +
                        "-----------------------------------");
                Scanner scanner = new Scanner(System.in);
                comando = scanner.nextInt();
                switch (comando) {
                    case 0:
                        print("Termino la partita ...");
                        break;
                    case 1:
                        attacco(matrice);
                        break;
                    case 2:
                        matrice.stampa();
                        break;
                    case 3:
                        matrice = startGame();
                        break;
                    default:
                        print("Comando non presente");
                }
            } catch (RuntimeException ex) {
                print("Inserire un numero valido");
            }
        } while (comando != 0 && matrice.checkEnd() != 0);
    }

    /**
     * attacco delle navi
     *
     * @param matrice griglia di gioco
     */
    private static void attacco(Matrice matrice) {
        boolean valide = false;
        int x, y;
        do {
            Scanner scanner = new Scanner(System.in);
            print("Coordinata X:");
            x = scanner.nextInt();
            print("Coordinata Y:");
            y = scanner.nextInt();
            if (isCordinateValide(matrice.sizeMatrice(), x, y)) {
                valide = true;
            } else {
                printerr("Coordinate non valide");
            }
        } while (!valide);
        if (matrice.getShip(x, y) == 0) {
            print("Acqua :V");
        } else {
            print("Colpito :D");
            matrice.setShip(x, y, 0);
        }

    }

    private static boolean isCordinateValide(int bound, int x, int y) {
        return x >= 0 && y >= 0 && x < bound && y < bound;
    }

    /**
     * avvio partita
     *
     * @return ritorna la matrice di gioco con le navi
     */
    private static Matrice startGame() {
        //definire la griglia quadrata
        defineGriglia();

        //creazione griglia
        Matrice matrice = new Matrice(dim);
        matrice.stampa();

        //definire il numero di navi
        createShips(matrice);
        return matrice;
    }

    /**
     * Definizione griglia di gioco
     */
    private static void defineGriglia() {
        do {
            try {
                print("Inserisci la dimensione della griglia > 1:");
                Scanner scanner = new Scanner(System.in);
                dim = scanner.nextInt();
            } catch (RuntimeException ex) {
                printerr("Inserire un valore valido");
            }
        } while (dim < 1);
    }

    /**
     * Numero delle navi
     *
     * @param matrice
     */
    private static void createShips(Matrice matrice) {
        int maxships = (dim * dim) / 3;
        int ships = -1;
        do {
            try {
                print("Inserisci il numero di navi (max: " + maxships + ")");
                Scanner scanner = new Scanner(System.in);
                ships = scanner.nextInt();
                if (ships > maxships) {
                    ships = -1;
                    printerr("Inserire un valore valido");
                }
            } catch (RuntimeException ex) {
                printerr("Inserire un valore valido");
            }
        } while (ships < 0);

        // set ships
        Random r = new Random();
        while (ships != 0) {
            int randomRow = r.nextInt(Integer.MAX_VALUE) % dim;
            int randomCol = r.nextInt(Integer.MAX_VALUE) % dim;
            if (matrice.getShip(randomRow, randomCol) == 0) {
                matrice.setShip(randomRow, randomCol, 1);
                ships--;
            }
        }
    }


    /**
     * Stampa di valori
     *
     * @param s stringa da stampare
     */
    public static void print(String s) {
        System.out.println(s);
    }

    /**
     * Stampa di errori
     *
     * @param s stringa da stampare
     */
    public static void printerr(String s) {
        System.err.println(s);
    }

}
