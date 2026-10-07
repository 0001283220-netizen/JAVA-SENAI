package Javalista5;

import java.util.Scanner;

public class bloco2n2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N;
        int i = 1;
        int soma = 0;

        System.out.print("Digite um número N: ");
        N = input.nextInt();

        while (i <= N) {
            soma = soma + i;
            i++;
        }

        System.out.println("A soma de 1 até " + N + " é: " + soma);

        input.close();
    }
}

