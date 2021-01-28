public class SwitchExample {
    public static void main(String[] args) {
        char c = '1';

        switch (c) {
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                System.out.println("c es un número " + c);
                break;
            default:
                System.out.println("c no es un número " + c);
        }
    }
}
