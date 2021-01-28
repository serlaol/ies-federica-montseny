public class AddArguments {
    public static void main(String[] args) {
//        int sum = 0;
//        for (int i = 0; i < args.length; i++) {
//            int v = Integer.parseInt(args[i]);
//            sum = sum + v;
//        }
//        System.out.println(sum);
        int i = 0;
        double sum = 0;
        while(i < args.length){
            int v = Integer.parseInt(args[i]);
            sum = sum + v;
            i++;
        }
        System.out.println(sum / args.length);
    }
}
