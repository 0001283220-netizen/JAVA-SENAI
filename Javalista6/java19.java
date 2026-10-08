package Javalista6;

import java.util.Scanner;

public class java19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idade;
        int soma = 0;
        int quantidade = 0;
        double media;

        System.out.print("Digite uma idade (0 para parar): ");
        idade = input.nextInt();

        while (idade != 0) {
            soma += idade;
            quantidade++;

            System.out.print("Digite outra idade (0 para parar): ");
            idade = input.nextInt();
        }

        if (quantidade > 0) {
            media = (double) soma / quantidade;
            System.out.println("Média das idades: " + media);
        } else {
            System.out.println("Nenhuma idade foi informada.");
        }

        input.close();
    }
}

