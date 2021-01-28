public class AreaV2 {

    static double calculateArea(double x1, double y1, double x2, double y2) {
        double a = x1 - x2;
        if(a < 0) {
            a = -a;
        }

        double b = y1 - y2;
        if(b<0) {
            b = -b;
        }

        double area = a * b;

        return area;
    }

    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Tiene que haber 4 argumentos");
        } else {
            // vertice 1
            double x1 = Double.parseDouble(args[0]);
            double y1 = Double.parseDouble(args[1]);
            // vertice 2
            double x2 = Double.parseDouble(args[2]);
            double y2 = Double.parseDouble(args[3]);

            double area = calculateArea(x1, y1, x2, y2);

            System.out.println("El área es " + area);
        }
    }
}
