import java.util.Scanner;

public class Rec11 {

    static double calcularMedia(double[] numbers) {
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            double number = numbers[i];
            sum = sum + number;
        }
        return sum / numbers.length;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("¿Cuántos números va a introducir?");
        int n = scan.nextInt();
        double[] numbers = new double[n];
        System.out.println("Introduzca " + n + " números");
        for (int i = 0; i < numbers.length; i++) {
            double m = scan.nextInt();
            numbers[i] = m;
        }
        double media = calcularMedia(numbers);
        System.out.println("La media es " + media);
    }
}