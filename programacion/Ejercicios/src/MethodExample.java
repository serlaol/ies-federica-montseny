public class MethodExample {
    static void myMethod(String message) {
        System.out.println("Ejecutado: " + message);
    }

    public static void main(String[] args) {
        myMethod("Msg1");
        myMethod("Msg2");
        myMethod("Msg3");
    }
}
