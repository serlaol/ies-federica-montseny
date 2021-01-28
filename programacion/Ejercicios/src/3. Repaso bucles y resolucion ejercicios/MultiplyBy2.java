public class MultiplyBy2 {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        while(a < b) {
            a = a * 2;
            System.out.println("Ahora a es " + a );
        }

        System.out.println("a es " + a );
    }
}
