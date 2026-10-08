package Javalista6;

import java.util.Scanner;

public class java14 {


        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int numero;

            System.out.print("Digite um número: ");
            numero = input.nextInt();

            while (numero != 0) {
                System.out.print("Digite outro número: ");
                numero = input.nextInt();
            }

            System.out.println("Você digitou 0. Fim do programa!");

            input.close();
        }
    }

