package Recuperacion;

import java.util.Scanner;

public class Ejercicio11 {
    static double average(double[] numeros) {
        double suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            double numero = numeros[i];
            suma = suma + numero;
        }
        return suma / numeros.length;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num = scan.nextInt();
        double[] numeros = new double[num];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce un numero: ");
            double numero = scan.nextDouble();
            numeros[i] = numero;
        }
        double media = average(numeros);
        System.out.println("La media es: " + media);
    }
}
