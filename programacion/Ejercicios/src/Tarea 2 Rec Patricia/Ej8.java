import java.util.Scanner;
public class Ej8 {
        public static void main(String[] args){
            Scanner num = new Scanner(System.in);
            int numEntero;
            int suma;

            System.out.print("Introduce un número positivo: ");
            numEntero = num.nextInt();
            suma = (numEntero*(numEntero+1))/2;
            System.out.printf("La suma es: %d", suma);

        }

    }
