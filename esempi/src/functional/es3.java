package functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class es3 {
    public static void main(String[] args) {

        List<Integer> addendi = Arrays.asList(4, 3, 2, 5);
        sommaListaInteri(addendi);


        List<Elemento> elementi = new ArrayList<>();
        elementi.add(new Elemento(4, "quattro"));
        elementi.add(new Elemento(3, "tre"));
        elementi.add(new Elemento(2, "due"));
        elementi.add(new Elemento(2, "due doppione"));
        elementi.add(new Elemento(5, "cinque"));
        System.out.println(elementi);

        sommaInteri(elementi);
    }



    private static void sommaInteri(List<Elemento> elementi) {
        int somma;
        somma = elementi.stream()
                .map(a -> mappaIlMioOggetto(a))
                .reduce(0, Integer::sum);
        System.out.println(somma);

        somma = elementi.stream()
                .mapToInt(a -> a.getValore())
                .distinct()
                .sum();
        System.out.println(somma);
    }




    /**
     * somma tutta la lista di interi passata utilizzando gli stream
     * @param addendi
     */
    private static void sommaListaInteri(List<Integer> addendi) {
        int somma = addendi.stream()
                .reduce(0, (sommaParziale, addendo) -> sommaParziale + addendo);
        System.out.println("somma " + somma);

        // La sintassi :: permette di avere il riferimento a un metodo
        // Integer::sum è il riferimento al metodo statico sum() di Integer
        int somma2 = addendi.stream()
                .reduce(0, Integer::sum);
        System.out.println("somma " + somma2);
    }






    private static Integer mappaIlMioOggetto(Elemento a) {
        return a.getValore();
    }
}

