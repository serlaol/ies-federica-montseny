import java.util.Scanner;

public class calculaMaximo {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int max;
        System.out.println("Calculo del número máximo");
        System.out.println("Introduce 3 números");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        // Calcular el maximo y asignarlo a max
        if(a>b && a>c) { max = a; } else if(b>c) { max = b; } else { max = c; }

        System.out.println(max);
    }
}
