public class Operators {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Tiene que haber dos argumentos");
        } else {
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[1]);
            boolean notEqual = areEqual(a, b);
            System.out.println("El resultado de compara a y b es " + notEqual);
        }
    }

    static boolean areEqual(double a, double b) {
        return a == b;
    }
}