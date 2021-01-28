import java.util.Scanner;

public class Rec8 {

    static int calcularSumatorio(int n) {
        int sumatorio = 0;
        for (int i = 0; i <= n; i++) {
            sumatorio = sumatorio + i;
        }
        return sumatorio;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca un número entero positivo");
        int n = scan.nextInt();
        while (n <= 0) {
            System.out.println(n + " no es un número entero positivo. Inténtelo de nuevo");
            n = scan.nextInt();
        }
        int sumatorio = calcularSumatorio(n);
        System.out.println("El sumatorio es " + sumatorio);
    }
}

// Ejercicio 8: ok, muy bien el bucle para solicitar un número entero positivo.