public class AverageLoop {
    static double calculateAverage(double[] numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum = sum + number;
        }
        return sum / numbers.length;
    }

    /**
     * Debe usar un metodo que calcule la media a partir de un
     * parametro de tipo double[]
     *
     * @param args
     */
    public static void main(String[] args) {
        // 1. Crear un array de double con el mismo tamaño que args
        // 2. Recorrer los argumentos con un bucle for (NO FOREACH)
        // 3. Parsear cada argumento a double
        // 4. Guardar el argumento parseado en la posición correspondiente

        if (args.length > 0) {
            double[] numbers = new double[args.length];
            for (int i = 0; i < args.length; i++) {
                double number = Double.parseDouble(args[i]);
                numbers[i] = number;
            }
            double avg = calculateAverage(numbers);

            System.out.println(avg);
        } else {
            System.out.println("Al menos hay que pasar un número");
        }
    }
}
