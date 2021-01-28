import java.util.Scanner;

public class Rec7 {

    static int maximoArray(int[] numbers) {
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("¿Cuántos números va a introducir?");
        int n = scan.nextInt();
        int[] numbers = new int[n];
        System.out.println("Introduzca " + n + " números");
        for (int i = 0; i < numbers.length; i++) {
            int m = scan.nextInt();
            numbers[i] = m;
        }
        int max = maximoArray(numbers);
        System.out.println("El máximo es " + max);
    }
}

// Ejercicio 7: ok, igual se podría separar en un método la introducción del array por parte del
// usuario