public class PrintFromTo {

    static void printFromAToB(int a, int b) {
        for (int i = a; i <= b; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        if (args.length == 2) {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);

            if (a > b) {
                int aux = a;
                a = b;
                b = aux;
            }

            printFromAToB(a, b);
        } else {
            System.out.println("Hacen falta dos argumentos");
        }

    }
}
