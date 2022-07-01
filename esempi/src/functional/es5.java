package functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class es5 {
    public static void main(String[] args) {

        // esempio consumer
        StampaNumero s = new StampaNumero();
        s.accept(4);


        // esempio function
        Potenza3 potenza3 = new Potenza3();
        System.out.println("potenza di 2 vale " + potenza3.apply(2));

        Function<Integer, Integer> func = num -> num * num * num;
        System.out.println("potenza di 2 vale " + func.apply(2));

        List<Persona> persone = Arrays.asList(
                new Persona("Saro", 24),
                new Persona("Taro", 21),
                new Persona("Ian", 19),
                new Persona("Al", 16));



        // esempio predicate
        VerificaInteroPari v = new VerificaInteroPari();
        System.out.println("27 è positivo ? " + v.test(27));

        System.out.println("quante persone cone età pari: " + persone.stream()
                .mapToInt(p -> p.getEta())
                .filter(p -> v.test(p))
                .count());






        CodiceFiscale cf = new CodiceFiscale();
        final List<String> cfs = persone.stream()
                .map(p -> cf.apply(p))
                .collect(Collectors.toList());
        System.out.println(cfs);
        System.out.println("========================");
        cfs.stream()
                .forEach(c -> System.out.println(c));
        System.out.println("========================");
        ConsumatoreCF ccf = new ConsumatoreCF();
        cfs.stream()
                .forEach(c -> ccf.accept(c));
        System.out.println("========================");



    }
}
