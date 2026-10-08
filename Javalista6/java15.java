package Javalista6;

import java.util.Scanner;

public class java15 { public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double preco;
    double total = 0;

    System.out.print("Digite o preço do produto: ");
    preco = input.nextDouble();

    while (preco >= 0) {
        total += preco;

        System.out.print("Digite o preço do próximo produto: ");
        preco = input.nextDouble();
    }

    System.out.println("Total da compra: R$ " + total);

    input.close();
}
}

