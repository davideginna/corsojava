package functional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * contare la lunghezza dei nomi
 */

public class Es1 {
    public static void main(String[] args) {
        List<String> listaNomi = new ArrayList<>();
        aggiungiNomi(listaNomi);


        long sizeListaNomi = listaNomi.size();
        System.out.println("size lista nomi: " + sizeListaNomi);
        long sizeListaNomiStream = listaNomi.stream().count();
        System.out.println("size lista nomi: " + sizeListaNomiStream);

        //verificaLunghezzaNome(listaNomi);
        //verificaLunghezzaNomeStream(listaNomi);

        listaNomi.stream().filter(a -> a.startsWith("h")).forEach(a -> System.out.println("ha la h ?" + a));

        var ll = listaNomi.stream().filter(a -> a.startsWith("h")).collect(Collectors.toList());
        System.out.println(ll);

        var l = listaNomi.stream().filter(a -> a.startsWith("h")).count();
        System.out.println(l);


    }


    private static void verificaLunghezzaNome(List<String> listaNomi) {
        int lunghezzaNomi = 5;
        int result = 0;
        for (int i = 0; i < listaNomi.size(); i++) {
            if (listaNomi.get(i).length() >= lunghezzaNomi) {
                result++;
            }
        }

        /*for (String nome : listaNomi) {
            if (nome.length() >= lunghezzaNomi) {
                result++;
            }
        }*/
        System.out.println("nomi con lunghezza superiore a " + lunghezzaNomi + " : " + result);
    }


    private static void aggiungiNomi(List<String> listaNomi) {
        Collections.addAll(listaNomi, "harry", "sirius", "draco", "ron", "luna", "hermione");
    }


    private static void verificaLunghezzaNomeStream(List<String> listaNomi) {
        int lunghezzaNomi = 5;
        long countLunghezzaNomi = listaNomi.stream()
                //.filter(nome -> verificaLunghezzaNomeGTE(nome, lunghezzaNomi))
                .filter(nome -> nome.length() >= 5).count();
        System.out.println("nomi con lunghezza superiore a " + lunghezzaNomi + " : " + countLunghezzaNomi);
    }

    private static boolean verificaLunghezzaNomeGTE(String nome, int size) {
        return nome.length() >= size;
    }

}
