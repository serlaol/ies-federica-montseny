import java.util.Scanner;

public class PrintFromToInteractive {

    static void printFromAToB(int a, int b) {
        for (int i = a; i <= b; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca número...");
        int a = scanner.nextInt();
        System.out.println("Introduzca número...");
        int b = scanner.nextInt();

        /*if (a > b) {
            int aux = a;
            a = b;
            b = aux;
        }*/

        printFromAToB(a, b);


    }
}
