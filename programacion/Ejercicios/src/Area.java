public class Area {


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

            double x = x1 - x2;
            if (x < 0) {
                x = -1 * x;
            }
            double y = y1 - y2;
            if (y < 0) {
                y = -1 * y;
            }
            double area = x * y;

            System.out.println("El área es " + area);
        }
    }
}
