package Javalista5;

public class bloco2n4  {
    public static void main(String[] args) {

        int i = 1;
        int soma = 0;

        while (i <= 50) {
            if (i % 2 == 0) {
                soma = soma + i;
            }
            i++;
        }

        System.out.println("A soma dos números pares é: " + soma);
    }
}
