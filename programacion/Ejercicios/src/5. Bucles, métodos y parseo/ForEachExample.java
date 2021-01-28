public class ForEachExample {
    public static void main(String[] args) {
        int sum = 0;
        for(String arg: args) {
            int v = Integer.parseInt(arg);
            sum = sum + v;
        }
        System.out.println(sum);
    }
}
