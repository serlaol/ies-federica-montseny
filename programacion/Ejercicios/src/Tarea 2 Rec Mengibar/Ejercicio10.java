package Recuperacion;

public class Ejercicio10 {
    public static void main(String[] args) {
        int[] numbers = {-3, 2, -1, 3, -6, -9};
        for (int number : numbers) {
            if (number < 0) {
                System.out.println("El numero: " + number + " es negativo.");
            }
        }
    }
}
