package functional;

import java.util.function.Function;

public class CodiceFiscale implements Function<Persona, String> {

    //calcolare il codice fiscale di una persona
    //possibile con le informazioni in possesso?

    @Override
    public String apply(Persona p) {
        String cf = "elaborazione";
        return cf;
    }
}
