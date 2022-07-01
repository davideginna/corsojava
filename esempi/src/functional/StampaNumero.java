package functional;

import java.util.function.Consumer;

public class StampaNumero implements Consumer<Integer> {
    @Override
    public void accept(Integer i) {
        System.out.println("Numero " + i);
    }
}
