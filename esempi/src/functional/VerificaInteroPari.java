package functional;

import java.util.function.Predicate;

public class VerificaInteroPari implements Predicate<Integer> {
    @Override
    public boolean test(Integer i) {
        return i % 2 == 0;
    }

}
