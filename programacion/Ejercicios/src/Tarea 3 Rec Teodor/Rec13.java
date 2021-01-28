import java.util.Scanner;

public class Rec13 {

    static int calcularSuma(int a, int b) {
        int c = a + b;
        return c;
    }

    static int calcularResta(int a, int b) {
        int c = a - b;
        return c;
    }

    static int calcularMultiplicacion(int a, int b) {
        int c = a * b;
        return c;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("¿Qué calculo desea realizar? (Suma/Resta/Multiplicación/Salir)");
            String respuesta = scan.next();
            if (respuesta.equals("Suma")) {
                System.out.println("Introuzca los números para la suma");
                int a = scan.nextInt();
                int b = scan.nextInt();
                int c = calcularSuma(a, b);
                System.out.println(a + " + " + b + " = " + c);
            } else if (respuesta.equals("Resta")) {
                System.out.println("Introuzca los números para la resta");
                int a = scan.nextInt();
                int b = scan.nextInt();
                int c = calcularResta(a, b);
                System.out.println(a + " - " + b + " = " + c);
            } else if (respuesta.equals("Multiplicación")) {
                System.out.println("Introuzca los números para la multiplicación");
                int a = scan.nextInt();
                int b = scan.nextInt();
                int c = calcularMultiplicacion(a, b);
                System.out.println(a + " * " + b + " = " + c);
            } else if (respuesta.equals("Salir")) {
                System.out.println("No desea realizar más operaciones");
                break;
            }
        }
    }
}