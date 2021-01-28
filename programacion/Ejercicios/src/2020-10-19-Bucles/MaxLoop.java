public class MaxLoop {

    public static void main(String[] args) {
        if (args.length > 0) {
            int[] numbers = new int[args.length];
            for (int i = 0; i < args.length; i++) {
                numbers[i] = Integer.parseInt(args[i]);
            }

            int max = highestValue(numbers);
            System.out.println("El valor maximo es: " + max);

        } else {
            System.out.println("Tiene que haber algun argumento");
        }


    }

    public static int highestValue(int[] miArray) {
        int max = miArray[0];
        for (int number : miArray) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
}





