package functional;

import java.util.function.Consumer;

public class ConsumatoreCF implements Consumer<String> {
    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}