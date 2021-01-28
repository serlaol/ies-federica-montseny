public class ImprimeNegativos {
    static void findNumber(int[] numbers){
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] < 0) {
                System.out.println("Negativo encontrado: " + numbers[i]);
            }
        }
    }

    /**
     * Debe usar un metodo que imprima por pantalla los números negativos
     * del parametro de tipo int[]
     * @param args
     */
    public static void main(String[] args) {
        // 1. Crear un array de int
        // 2. Recorrer los argumentos con un bucle for
        // 3. Busca e imprime los números negativos
        int[] numbers = {2, 1, -1, -5};
        findNumber(numbers);
    }
}