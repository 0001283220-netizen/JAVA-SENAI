package Javalista7;

import java.util.Scanner;

public class java20 {

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            double valor;
            double total = 0;
            double desconto = 0;
            double valorFinal;

            System.out.print("Digite o valor do produto (0 para finalizar): ");
            valor = sc.nextDouble();

            while (valor != 0) {
                total += valor;

                System.out.print("Digite o valor do produto (0 para finalizar): ");
                valor = sc.nextDouble();
            }

            if (total > 500) {
                desconto = total * 0.10;
            }

            valorFinal = total - desconto;

            System.out.println("Total da compra: R$ " + total);
            System.out.println("Desconto: R$ " + desconto);
            System.out.println("Valor final: R$ " + valorFinal);

            sc.close();
        }
    }
}
