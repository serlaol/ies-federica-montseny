public class MethodExampleV2 {
    static void myMethod(int message) {
        System.out.println("Ejecutado: " + message);
    }

    public static void main(String[] args) {
        myMethod(Integer.parseInt(args[0]));
        myMethod(Integer.parseInt(args[1]));
        myMethod(Integer.parseInt(args[2]));
    }
}
