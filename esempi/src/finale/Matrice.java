package finale;


public class Matrice {
    private int[][] matrice;

    public Matrice(int dim) {
        matrice = new int[dim][dim];
        for (int r = 0; r < dim; r++) {
            for (int c = 0; c < dim; c++) {
                matrice[r][c] = 0;
            }
        }
    }

    /**
     * grandezza marice
     *
     * @return ritorna la grandezza della matrice
     */
    public int sizeMatrice() {
        return matrice.length;
    }

    /**
     * get della cella
     *
     * @param row riga
     * @param col colonna
     * @return ritorna il valore della cella
     */
    public int getShip(int row, int col) {
        return matrice[row][col];
    }

    /**
     * set della cella
     *
     * @param row riga
     * @param col colonna
     */
    public void setShip(int row, int col,int val) {
        matrice[row][col] = val;
    }

    /**
     * stampa matrice
     */
    public void stampa() {
        for (int r = 0; r < matrice.length; r++) {
            for (int c = 0; c < matrice.length; c++) {
                System.out.print(matrice[r][c] + " ");
            }
            System.out.print("\n");
        }
    }

    public int checkEnd() {
        int result = 0;
        for (int r = 0; r < matrice.length; r++) {
            for (int c = 0; c < matrice.length; c++) {
                result += matrice[r][c];
            }
        }
        return result;
    }
}
