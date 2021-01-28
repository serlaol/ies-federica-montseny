import java.util.Random;

public class WhileExampleV2 {

    public static void main(String[] args) {
        Random r = new Random();
        int dice = r.nextInt(6);
        while(dice != 5) {
            System.out.println("Sigue probando");
            dice = r.nextInt(6);
        }

        System.out.println("Conseguido");

    }
}
