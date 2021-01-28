import java.util.Scanner;

public class Interactive {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor introduzca mensaje...");
        String line1 = scanner.nextLine();
        System.out.println("Ha introducido: " + line1);
        System.out.println("Y ahora introduce un número entero...");
        int line2 = scanner.nextInt();
        System.out.println("Ha introducido: " + line2);
    }
}
