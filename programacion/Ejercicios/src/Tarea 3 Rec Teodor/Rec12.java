import java.util.Scanner;

public class Rec12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        int contador = 0;
        do {
            System.out.println("Introduzca un numero");
            n = scan.nextInt();
            contador++;
        } while (n > 0);
        while (n < 0) {
            System.out.println("Ha introducido " + contador + " numeros");
            break;
        }
    }
}