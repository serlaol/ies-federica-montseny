public class MultiplyBy2V2 {

    static int multiplyBy2(int v) {
        return v * 2;
    }

    public static void main(String[] args) {
        if (args.length == 2) {
            int a = Integer.parseInt(args[0]); // a = 3
            int b = Integer.parseInt(args[1]); // b = 2
            if (b < a) {
                int aux = b; // aux = 2 y a = 3 y b = 2
                b = a; // aux = 2 y a = 3 y b = 3
                a = aux; // aux = 2 y a = 2 y b = 3
            }

            if (a > 0 && b > 0) {
                while (a < b) {
                    a = multiplyBy2(a);
                    System.out.println("Ahora a es " + a);
                }

                System.out.println("a es " + a);
            } else {
                System.out.println("El valor menor no puede ser 0 y deben ser positivos");
            }
        } else {
            System.out.println("Debe haber dos parametros");
        }
    }
}
