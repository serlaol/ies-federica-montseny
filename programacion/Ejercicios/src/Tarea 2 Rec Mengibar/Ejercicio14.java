package Recuperacion;

import java.util.Scanner;

public class Ejercicio14 {
    static Scanner scan = new Scanner(System.in);

    static double[] pideArray() {
        System.out.println("Introduce el numero de valores: ");
        int lenght = scan.nextInt();
        while (lenght <= 0) {
            System.out.println("No es valido.");
            lenght = scan.nextInt();
        }
        System.out.println("Introduce los numeros: ");
        double[] array = new double[lenght];
        for (int i = 0; i < array.length; i++) {
            double num = scan.nextDouble();
            array[i] = num;
        }
        return array;
    }

    static double max(double[] array) {
        double max = 0;
        for (int i = 0; i < array.length; i++) {
            double num = array[i];
            if (max < num) {
                max = num;
            }
        }
        return max;
    }

    static double min(double[] array) {
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            double num = array[i];
            if (min > num) {
                min = num;
            }
        }
        return min;
    }

    static double media(double[] numbers) {
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("Introduce operacion: Max, Min, Media.");
            String operation = scan.next();
            System.out.println();
            if (operation.equals("Max")) {
                double maximum = max(pideArray());
                System.out.println(maximum);
            } else if (operation.equals("Min")) {
                double min = min(pideArray());
            } else if (operation.equals("Media")) {
                double media = media(pideArray());
                System.out.println(media);
            }
        }
    }
}