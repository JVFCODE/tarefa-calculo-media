public class Operadores {

    public static void main(String[] args) {
        operacoesAritmeticas();
        operacoesAtribuicoes();
    }

    private static void operacoesAtribuicoes() {
        int num1 = 10;
        int num2 = 30;
        int num3 = 60;
        int num4 = 100;
    }

    public static void operacoesAritmeticas() {
        int num1 = 10;
        int num2 = 30;
        int num3 = 60;
        int num4 = 100;

        int total = num1 + num2 + num3 + num4;
        System.out.println("Soma: " + total);

        double media = (double) total / 4;
        System.out.println("Média: " + media);
    }
}
