public class Ej6 {
    public static void main(String[] args) {
        double[] lista = new double[100];
        double maximo = lista[0];

        for (int i = 0; i < 100; i++) {
            if (maximo < lista[i])
                maximo = lista[i];
        }

        System.out.println("El valor máximo es " + maximo);
    }
}
