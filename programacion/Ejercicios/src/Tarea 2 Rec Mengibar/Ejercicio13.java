package Recuperacion;

import java.util.Scanner;

public class Ejercicio13 {
    static Scanner scan = new Scanner(System.in);

    static void sum(int num1, int num2) {
        int suma = num1 + num2;
        System.out.println("El resultado de sumar " + num1 + " + " + num2 + " es igual a: " + suma);
    }

    static void subtract(int num1, int num2) {
        int resta = num1 - num2;
        System.out.println("El resultado de restar " + num1 + " - " + num2 + " es igual a: " + resta);
    }

    static void multiply(int num1, int num2) {
        int multiplicar = num1 * num2;
        System.out.println("El resultado de multiplicar " + num1 + " * " + num2 + " es igual a: " + multiplicar);
    }

    static void divide(int num1, int num2) {
        while (num2 == 0) {
            System.out.println("El divisor no puede ser o. Introduce otro divisor.");
            num2 = scan.nextInt();
        }
        int dividir = num1 / num2;
        System.out.println("El resultado de dividir " + num1 + " / " + num2 + " es igual a: " + dividir);
    }

    static String operations() {
        System.out.println("Introduce la operacion que desea realizar (Suma/Resta/Multiplicacion/Division/Salir).");
        String operation = scan.nextLine();
        if (operation.equals("")) {
            operation = scan.nextLine();
        }
        return operation;
    }

    public static void main(String[] args) {
        String operation = operations();
        while (!operation.equals("Salir")) {
            System.out.println("Introduce valores enteros.");
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();
            if (operation.equals("Suma")) {
                sum(num1, num2);
            } else if (operation.equals("Resta")) {
                subtract(num1, num2);
            } else if (operation.equals("Multiplicacion")) {
                multiply(num1, num2);
            } else {
                divide(num1, num2);
            }
            operation = operations();
        }
    }
}
