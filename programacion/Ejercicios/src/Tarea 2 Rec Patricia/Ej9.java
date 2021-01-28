import java.util.Scanner;
public class Ej9 {

        static long factorialFor(long numero) {
            long resultado = 1;
            for (int i = 1; i <= numero; i++) {
                resultado = resultado * i;
            }
            return resultado;
        }

        static long factorialWhile(long numero) {
            long resultado = 1;
            int i = 1;
            while (i <= numero) {
                resultado = resultado * i;
                i++;
            }
            return resultado;
        }

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Introduce un numero...");
            long numero = scan.nextLong();
            while (numero < 1) {
                System.out.println("Ingrese un positivo...");
                numero = scan.nextLong();
            }
            System.out.println(factorialWhile(numero));
        }
    }
