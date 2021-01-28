import java.util.Scanner;

public class Rec9 {

    static int calcularFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca un número entero positivo");
        int n = scan.nextInt();
        while (n <= 0) {
            System.out.println(n + " no es un número entero positivo. Inténtelo de nuevo");
            n = scan.nextInt();
        }
        int factorial = calcularFactorial(n);
        System.out.println("El factorial es " + factorial);
    }
}

// Ejercicio 9: ok