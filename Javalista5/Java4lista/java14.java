package Java4lista;

import java.util.Scanner;

public class java14 {

        private static Scanner input = new Scanner(System.in);

        public static void main(String[] args) {
            double salario, imposto;

            System.out.println("Digite o salário:");
            salario = input.nextDouble();

            imposto = (salario <= 2000)
                    ? 0
                    : (salario <= 5000)
                    ? salario * 0.10
                    : salario * 0.20;

            System.out.println("Imposto: R$ " + imposto);
        }
    }

