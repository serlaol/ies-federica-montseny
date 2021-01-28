import java.util.Scanner;

public class Rec14 {

    static double buscaMaximo(double[] numbers) {
        double max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            double number = numbers[i];
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    static double buscaMinimo(double[] numbers) {
        double min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            double number = numbers[i];
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

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
        while (true) {
            System.out.println("¿Qué operación desea realizar? (Máximo/Mínimo/Media/Salir)");
            String respuesta = scan.next();
            if (respuesta.equals("Máximo")) {
                System.out.println("¿Cuántos números va a introducir para calcular el máximo?");
                int n = scan.nextInt();
                double[] numbers = new double[n];
                System.out.println("Introduzca " + n + " números");
                for (int i = 0; i < numbers.length; i++) {
                    numbers[i] = scan.nextInt();
                }
                double max = buscaMaximo(numbers);
                System.out.println("El máximo es " + max);
            } else if (respuesta.equals("Mínimo")) {
                System.out.println("¿Cuántos números va a introducir para calcular el mínimo?");
                int n = scan.nextInt();
                double[] numbers = new double[n];
                System.out.println("Introduzca " + n + " números");
                for (int i = 0; i < numbers.length; i++) {
                    numbers[i] = scan.nextInt();
                }
                double min = buscaMinimo(numbers);
                System.out.println("El máximo es " + min);
            } else if (respuesta.equals("Media")) {
                System.out.println("¿Cuántos números va a introducir para calcular el media?");
                int n = scan.nextInt();
                double[] numbers = new double[n];
                System.out.println("Introduzca " + n + " números");
                for (int i = 0; i < numbers.length; i++) {
                    numbers[i] = scan.nextInt();
                }
                double media = calcularMedia(numbers);
                System.out.println("El máximo es " + media);
            } else if (respuesta.equals("Salir")) {
                System.out.println("No desea realizar más operaciones");
                break;
            }
        }
    }
}