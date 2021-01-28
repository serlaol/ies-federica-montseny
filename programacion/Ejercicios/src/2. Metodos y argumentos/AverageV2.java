public class AverageV2 {
    static double calculateAverage(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    public static void main(String[] args) {
        if(args.length != 3) {
            System.out.println("Hay que pasar 3 argumentos");
        } else {
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[1]);
            double c = Double.parseDouble(args[2]);

            double average = calculateAverage(a, b, c);

            System.out.println("La media es " + average);
        }
    }
}
