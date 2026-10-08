package Javalista6;

import java.util.Scanner;

public class java17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;
        int fatorial = 1;
        int contador = 1;

        System.out.print("Digite um número: ");
        numero = input.nextInt();

        while (contador <= numero) {
            fatorial = fatorial * contador;
            contador++;
        }

        System.out.println("Fatorial de " + numero + " = " + fatorial);

        input.close();
    }
}

