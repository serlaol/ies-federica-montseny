public class DoWhileExample {

    public static void main(String[] args) {
        if (args.length == 1) {
            int iterations = Integer.parseInt(args[0]);
            int i = 0;
            do {
                System.out.println("Hola mundo " + i);
                i++;
            } while (i < iterations);
        } else {
            System.out.println("Es necesario pasar un número");
        }
    }
}
