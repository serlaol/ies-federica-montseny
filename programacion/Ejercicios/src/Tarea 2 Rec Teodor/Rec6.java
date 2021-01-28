public class Rec6 {

    static int maximoArray(int[] numbers) {
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8};
        int max = maximoArray(numbers);
        System.out.println("El máximo es " + max);
    }
}

// Ejercicio 6: ok.