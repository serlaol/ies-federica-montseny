public class IsVowel {

    static String isVowel(char c){
        String message;
        switch (c) {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                message = "Es una vocal";
                break;
            case 'b':
            case 'c':
            case 'd':
            case 'f':
            case 'g':
            case 'h':
            case 'j':
            case 'k':
                message = "Es una consonante";
                break;
            default:
                message = "Es otra cosa";
        }
        return message;
    }

    public static void main(String[] args) {
        if (args.length == 1 && args[0].length() == 1) {
            char c = args[0].charAt(0);
            System.out.println(isVowel(c));
        } else {
            System.out.println("Debe introducirse un únco caracter");
        }
    }
}

