package Javalista5;

import java.util.Scanner;

public class bloco2n3 {


        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            int i = 1;
            double nota;
            double soma = 0;
            double media;

            while (i <= 5) {
                System.out.print("Digite a " + i + "ª nota: ");
                nota = input.nextDouble();

                soma = soma + nota;
                i++;
            }

            media = soma / 5;

            System.out.println("A média das notas é: " + media);

            input.close();
        }
    }

