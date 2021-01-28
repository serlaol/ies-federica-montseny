package Recuperacion;

import java.util.Scanner;

public class Ejercicio7 {
    private static int Maximum(int[] list) {
        int num1 = list[0];
        for (int i = 0; i < list.length; i++) {
            if (list[i] > num1) {
                num1 = list[i];
            }
        }
        return num1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuantos numeros va a introducir?");
        int num = scanner.nextInt();
        int[] arrayNumbers = new int[num];
        for (int i = 0; i < arrayNumbers.length; i++) {
            System.out.println("Introduzca los numeros");
            arrayNumbers[i] = scanner.nextInt();
        }
        System.out.println("El numero maximo que has introducido es: " + Maximum(arrayNumbers));
    }
}
