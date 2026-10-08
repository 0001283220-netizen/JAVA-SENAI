package Java4lista;

import java.util.Scanner;

public class java8
 {
        private static Scanner input = new Scanner(System.in);

        public static void main(String[] args) {
            double peso, altura, imc;
            String classificacao;

            System.out.println("Digite o peso em kg:");
            peso = input.nextDouble();

            System.out.println("Digite a altura em metros:");
            altura = input.nextDouble();

            imc = peso / (altura * altura);

            classificacao = (imc < 18.5)
                    ? "Abaixo do peso"
                    : (imc <= 24.9)
                    ? "Peso ideal"
                    : "Acima do peso";

            System.out.println("IMC: " + imc);
            System.out.println("Classificação: " + classificacao);
        }
    }

