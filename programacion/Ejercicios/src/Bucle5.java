import  java.util.Scanner;

public class Bucle5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Double num = 8.0;
        System.out.println(String.format("%.0f", num));

        int num2 = (int) Math.round(num);
        System.out.println(num2);


    }
}
