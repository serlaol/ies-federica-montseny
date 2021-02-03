import java.util.Scanner;

public class calculaMaximo {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int max;

        System.out.println("Calculo del número máximo");
        System.out.println("Introduce 3 números");

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        // Calcular el maximo y asignarlo a max
        if (a > b && a > c)
        {
            max = a;
        }
        else if (b > c)
        {
            max = b;
        }
        else { max = c; }

        System.out.println("El máximo es: " + max);
    }
}
