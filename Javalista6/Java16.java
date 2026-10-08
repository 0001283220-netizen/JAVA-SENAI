package Javalista6;

import java.util.Scanner;

public class Java16 {


        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            double base;
            int expoente;
            double resultado = 1;
            int contador = 0;

            System.out.print("Digite a base: ");
            base = input.nextDouble();

            System.out.print("Digite o expoente: ");
            expoente = input.nextInt();

            while (contador < expoente) {
                resultado = resultado * base;
                contador++;
            }

            System.out.println("Resultado: " + resultado);

            input.close();
        }
    }

