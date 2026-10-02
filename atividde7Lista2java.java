
import java.util.Scanner;

        private static Scanner input = new Scanner(System.in);

        public static void main(String[] args) {
            double salarioBruto;
            double imposto;
            double salarioLiquido;

            System.out.println("Insira o salário bruto:");
            salarioBruto = input.nextDouble();

            imposto = salarioBruto * 0.10;
            salarioLiquido = salarioBruto - imposto;

            System.out.println("Valor do imposto: R$ " + imposto);
            System.out.println("Salário líquido: R$ " + salarioLiquido);
        }
