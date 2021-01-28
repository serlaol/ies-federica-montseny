public class FindDoubleInArray {
    static void findNumber(double[] numbers, double numberToFind){
        boolean found = false;
        for(int i = 0; i < numbers.length && !found; i++) {
            if(numbers[i] == numberToFind) {
                found = true;
                System.out.println("Número " + numbers[i] + " encontrado.");
            }
        }
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
        double numberToFind = 1.0;
        findNumber(numbers, numberToFind);
    }
}
