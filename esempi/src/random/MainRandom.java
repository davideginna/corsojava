package random;

import java.util.Random;

public class MainRandom {
    public static void main(String[] args) {
        Random random = new Random(System.currentTimeMillis());
        int limite = 101;
        for (int i = 0; i < 200; i++) {
            int rand = random.nextInt(limite);
            if (rand % 2 == 0) {
                System.out.println("Generatore random: " + rand);
            }
        }
    }
}
