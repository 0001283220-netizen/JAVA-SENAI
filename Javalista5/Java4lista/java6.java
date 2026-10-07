package Java4lista;

import java.util.Scanner;

public class java6 {;

        private static Scanner input = new Scanner(System.in);

        public static void main(String[] args) {
            double numero1, numero2, resultado;
            char operacao;

            System.out.println("Digite o primeiro número:");
            numero1 = input.nextDouble();

            System.out.println("Digite o segundo número:");
            numero2 = input.nextDouble();

            System.out.println("Digite a operação (+, -, *, /):");
            operacao = input.next().charAt(0);

            resultado = (operacao == '+')
                    ? numero1 + numero2
                    : (operacao == '-')
                    ? numero1 - numero2
                    : (operacao == '*')
                    ? numero1 * numero2
                    : (operacao == '/')
                    ? numero1 / numero2
                    : 0;

            System.out.println("Resultado: " + resultado);
        }
    }

