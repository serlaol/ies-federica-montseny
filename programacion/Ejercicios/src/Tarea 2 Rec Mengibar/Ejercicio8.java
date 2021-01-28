package Recuperacion;

import java.util.Scanner;

public class Ejercicio8 {

    static int sumatory(int a) {
        int sum = 0;
        for (int i = 0; i < a; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce tu numero entero...");
        int num = scan.nextInt();
        int[] sum = new int[num];
        if (args.length == 1) {
            int a = Integer.parseInt(args[0]);
            System.out.println("La suma es " + sumatory(a));
        }
    }
}
