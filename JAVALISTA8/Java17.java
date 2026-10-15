package JAVALISTA8;

public class Java17
{
    public static void main(String[] args) {
        int i = 1;
        int soma = 0;

        do {
            if (i % 3 == 0 || i % 5 == 0) {
                soma += i;
            }
            i++;
        } while (i <= 100);

        System.out.println("A soma dos multiplos de 3 ou 5 e: " + soma);
    }
}

