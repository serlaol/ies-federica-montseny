public class ForExample {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        int i = 0;
        while(i < args.length) {
            System.out.println(args[i]);
            i++;
        }
    }
}
