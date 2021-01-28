public class Sumatory {
    static int sumatory(int a) {
        int sum = 0;
        for (int i = 0; i <= a; i++) {
            sum = sum + i;

        }
        return sum;
    }

    public static void main(String[] args) {
        if (args.length == 1) {
            int a = Integer.parseInt(args[0]);
            System.out.println("La suma es " + sumatory(a));
        }


    }
}
