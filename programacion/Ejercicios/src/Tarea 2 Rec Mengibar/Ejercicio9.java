package Recuperacion;

import java.util.Scanner;

public class Ejercicio9 {
    static int factorial(int a) {
        int factorial = 1;
        for (int i = 0; i <= a; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un numero...");
        int number = scan.nextInt();
        factorial(number);
        System.out.println(number);
    }
}
