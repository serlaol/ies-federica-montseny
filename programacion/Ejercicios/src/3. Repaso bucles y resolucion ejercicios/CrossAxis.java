public class CrossAxis {

    static boolean crossAxis(double v1, double v2) {
        // return (v1 <= 0 && v2 >= 0) || (v1 >= 0 && v2 <= 0);
        return v1 * v2 <= 0;
    }

    public static void main(String[] args) {
        if (args.length == 4) {
            double x1 = Double.parseDouble(args[0]);
            double y1 = Double.parseDouble(args[1]);
            double x2 = Double.parseDouble(args[2]);
            double y2 = Double.parseDouble(args[3]);

            if (crossAxis(y1, y2)) {
                System.out.println("Cruza el eje X");
            } else {
                System.out.println("No cruza el eje X");
            }

            if (crossAxis(x1, x2)) {
                System.out.println("Cruza el eje Y");
            } else {
                System.out.println("No cruza el eje Y");
            }
        } else {
            System.out.println("Debe haber cuatro argumentos");
        }
    }
}
