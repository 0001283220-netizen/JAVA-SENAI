package javalista9;

import java.util.Scanner;

public class Java9 {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite um numero: ");
            int numero = sc.nextInt();

            long fatorial = 1;

            for (int i = 1; i <= numero; i++) {
                fatorial = fatorial * i;
            }

            System.out.println("O fatorial de " + numero + " e: " + fatorial);

            sc.close();
        }
    }
