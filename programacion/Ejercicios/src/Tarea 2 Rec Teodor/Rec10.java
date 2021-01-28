import java.util.Scanner;

public class Rec10 {

    static int cuentaNegativos(int[] numbers) {
        int negativo = 0;
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            if (number < 0) {
                negativo = negativo + 1;
            }
        }
        return negativo;
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
        int negativo = cuentaNegativos(numbers);
        System.out.println("Ha introducido " + negativo + " números negativos");
    }
}

// Ejercicio 10: ok