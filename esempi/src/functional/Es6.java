package functional;

import java.util.Optional;

public class Es6 {
    public static void main(String[] args) {

        // esempio di orElse
        Optional<Integer> op = Optional.empty();
        System.out.println(op.orElse(100));

        // differenza orElse - orElseGet
        // orElse(): returns the value if present, otherwise returns other
        // orElseGet(): returns the value if present, otherwise invokes other and returns the result of its invocation

        String name = Optional.of("nome mio")
                .orElse(getAltroNome());
        System.out.println(name);

        name = Optional.of("nome mio 2")
                .orElseGet(() -> getAltroNome());
        System.out.println(name);
    }

    private static String getAltroNome() {
        System.out.println("eseguo funzione getAltroNome");
        return "altro nome";
    }
}
