package entity;
import java.util.Random;

public class CardGenerator {
    public static Card execute() {
        Random random = new Random();
        int value = random.nextInt(100);
        // para implementações futuras
        return new CommonCard();
    }
}