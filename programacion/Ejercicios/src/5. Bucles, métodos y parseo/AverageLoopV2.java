public class AverageLoopV2 {
    static double calculateAverage(double[] numbers){
        double sum = 0;
        for(double number: numbers) {
            sum = sum + number;
        }
        return sum / numbers.length;
    }

    /**
     * Debe usar un metodo que calcule la media a partir de un
     * parametro de tipo double[]
     * @param args
     */
    public static void main(String[] args) {
        // 1. Crear un array de double con el mismo tamaño que args
        // 2. Recorrer los argumentos con un bucle for (NO FOREACH)
        // 3. Parsear cada argumento a double
        // 4. Guardar el argumento parseado en la posición correspondiente
        double[] numbers = {2.0, 1.0, 1.5};

        double avg = calculateAverage(numbers);

        System.out.println(avg);
    }
}
