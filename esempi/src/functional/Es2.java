package functional;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * comparison time
 */
public class Es2 {

    public static void main(String[] args) {
        List<Integer> list = generaLista();
        System.out.println("lista generata");
        contaPari(list);
        contaPariStream(list);
    }


    private static List<Integer> generaLista() {
        List<Integer> list = new ArrayList<>();
        int size = 5000000;
        Random random = new Random(System.currentTimeMillis());

        for (int i = 0; i < size; i++) {
            list.add(random.nextInt());
        }
        return list;
    }

    private static void contaPariStream(List<Integer> list) {
        long start = System.currentTimeMillis();
        long count = list.stream()
                .filter(integer -> integer % 2 == 0)
                .count();
        long end = System.currentTimeMillis();
        System.out.println("contaPariStream durata in millisecondi " + (end - start));
        System.out.println("contaPariStream count " + count);
    }

    private static void contaPari(List<Integer> list) {
        long start = System.currentTimeMillis();
        int count = 0;
        for (Integer i : list) {
            if (i % 2 == 0) {
                count++;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("contaPari durata in millisecondi " + (end - start));
        System.out.println("contaPari count  " + count);
    }

}
