public class Sum {
    static int add(int[] numbers){
        int res = 0;
        for(int i = 0; i < numbers.length; i++) {
            res+= numbers[i];
        }
        return res;
    }

    public static void main(String[] args) {
        // 1. Crear un array de int
        // 2. Crear un método que devuelva la suma de un array de enteros
        // 2. Invocar el método desde el main pasando el array que hemos definido
        // 3. Imprimir el resultado de la suma
        int[] numbers = {2, 1, -1, -5};
        int res = add(numbers);
        System.out.println("Suma = " + res);
    }
}