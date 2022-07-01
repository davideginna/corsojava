package functional;

import java.util.function.Function;

public class Potenza3 implements Function<Integer, Integer> {
    @Override
    public Integer apply(Integer i) {
        return i * i * i;
    }
}
