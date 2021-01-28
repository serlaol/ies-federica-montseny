package Recuperacion;

import java.util.Scanner;

public class Ejercicio5 {

    public static double mediaDouble(double[] miArray) {
        int suma = 0;
        double media = 0;
        for (double arrayDouble : miArray) {
            media = media + arrayDouble;
        }
        media = media / miArray.length;
        return media;
    }

    static void imprimir(double resultado) {
        System.out.println("La media es: " + resultado);
    }

    public static double[] valoresArray(String[] valor) {
        double out[] = new double[valor.length];
        for (int i = 0; i < valor.length; i++) {
            out[i] = Double.parseDouble(valor[i]);
        }
        return out;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce tus numeros: ");
        String valoresArray = in.nextLine();
        String[] parts = valoresArray.split(" ");
        double out[] = valoresArray(parts);
        double devuelveMedia = mediaDouble(out);
        imprimir(devuelveMedia);
    }
}

// Ejercicio 5: bien separadas las funciones, para solicitar el array de doubles al usuario, mejor
// usar un bucle, que utilizar el método split y luego la conversión.