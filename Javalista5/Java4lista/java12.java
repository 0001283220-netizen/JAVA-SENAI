package Java4lista;

import java.util.Scanner;

public class java12 {


        private static Scanner input = new Scanner(System.in);

        public static void main(String[] args) {
            double valor, valorFinal;
            int codigo;

            System.out.println("Digite o valor do produto:");
            valor = input.nextDouble();

            System.out.println("Digite o código do pagamento:");
            System.out.println("1 - À vista (10% de desconto)");
            System.out.println("2 - Cartão (5% de desconto)");
            System.out.println("3 - 2x (preço normal)");
            codigo = input.nextInt();

            valorFinal = (codigo == 1)
                    ? valor * 0.90
                    : (codigo == 2)
                    ? valor * 0.95
                    : (codigo == 3)
                    ? valor
                    : 0;

            System.out.println("Valor final: R$ " + valorFinal);
        }
    }

