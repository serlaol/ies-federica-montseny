import java.util.Scanner;
public class Ej10 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n = 0;
            int count = 0;
            while (n < 0) {
                System.out.println("Introduzca un número negativo: ");
                n = scan.nextInt();
                count++;
            }
            System.out.println("Se han introducido " + count + " números");
        }
    }

