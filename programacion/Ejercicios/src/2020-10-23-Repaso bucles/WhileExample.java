public class WhileExample {

    static int[] devuelveNegativos(int[] numbers) {
        int[] negativos = new int[cuantosNegativos(numbers)];
        int j=0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] < 0) {
                negativos[j] = numbers[i];
                j++;
            }
        }
        return negativos;
    }

    static int cuantosNegativos(int[] numbers) {
        // Inicializamos el numero de negativos a 0
        int numNegativos = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                numNegativos++;
            }
        }
        return numNegativos;
    }

    static int suma(int[] numbers) {
        // Incializamos la suma a 0
        int sum = 0;
        // Recorremos todos los sumandos
        for (int i = 0; i < numbers.length; i++) {
            // Sumamos el numero al total
            sum = sum + numbers[i];
        }
        // Devolvemos la suma final
        return sum;
    }

    public static void main(String[] args) {
//        int a = 5;
//        while(a > 0) {
//            System.out.println(a);
//            a--;
//        }

//        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
//        }

//        for (int i = 0; i < args.length; i++) {
//            System.out.println(args[i]);
//        }

        // Creo un array de enteros con el mismo tamaño que args
        int[] numbers = new int[args.length];
        // Ahora recorro todos los argumentos
        for (int i = 0; i < args.length; i++) {
            // Asigno el resultado de parsear el argumento
            // en la posicion i a la misma posicion de numbers
            numbers[i] = Integer.parseInt(args[i]);
        }

        int sum = cuantosNegativos(numbers);

        System.out.println(sum);

        int[] negativos = devuelveNegativos(numbers);
    }
}
