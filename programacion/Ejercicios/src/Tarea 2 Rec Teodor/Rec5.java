import java.util.Scanner;

public class Rec5 {

    static double mediaArray(double[] numbers) {
        double media = 0;
        for (int i = 0; i < numbers.length; i++) {
            double number = numbers[i];
            media = media + number;
        }
        return media / numbers.length;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("¿Cuántos números va a introducir?");
        int n = scan.nextInt();
        double[] numbers = new double[n];
        System.out.println("Introduzca " + n + " números");
        for (int i = 0; i < numbers.length; i++) {
            int m = scan.nextInt();
            numbers[i] = m;
        }
        double media = mediaArray(numbers);
        System.out.println("La media es " + media);
    }
}

// Ejercicio 5: Array de doubles y no de enteros
