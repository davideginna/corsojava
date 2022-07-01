package functional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class es4 {
    public static void main(String[] args) {

        List<Persona> persone = Arrays.asList(
                new Persona("Saro", 24),
                new Persona("Taro", 21),
                new Persona("Ian", 19),
                new Persona("Al", 16)
        );

        // ESEMPIO
        stampaListaEta(persone);


        /////////////////////////
        // ESERCIZI
        /////////////////////////


        // calcola la somma delle eta
        sommaEta(persone);

        // trova i minorenni
        minorenni(persone);

        // trova la persona con eta maggiore tra quelli che hanno meno di 20 anni
        personaMaxEta(persone);
    }


    private static void personaMaxEta(List<Persona> persone) {
        Optional<Persona> pmax = persone.stream()
                .filter(x -> x.getEta() < 20)
                .reduce(Persona::getMax);
        // versione alternativa
//        pmax = persone.stream()
//                .filter(x -> x.getEta() < 20)
//                .max(Comparator.comparing(Persona::getEta));
        System.out.println("la persona più grande con eta inferiore a 20 è : " + pmax.get().getNome());

    }

    private static void minorenni(List<Persona> persone) {
        List<String> listaMinorenni = persone.stream()
                .filter(p -> !p.isMaggiorenne())
                .map(Persona::getNome)
                .collect(Collectors.toList());
        System.out.println(listaMinorenni);
    }

    private static void sommaEta(List<Persona> persone) {
        int sommaEta = persone.stream()
                .map(Persona::getEta)
                .reduce(0, Integer::sum);
        System.out.println(sommaEta);
    }

    private static void stampaListaEta(List<Persona> persone) {
        final List<Integer> listaEta = persone.stream()
                .map(p -> p.getEta())
                .collect(Collectors.toList());
        System.out.println(listaEta);
    }
}
