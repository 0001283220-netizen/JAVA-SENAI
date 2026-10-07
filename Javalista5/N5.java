package Javalista5;

import java.util.Scanner;

public class N5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int limite;
        int i = 0;

        System.out.print("Digite um número limite: ");
        limite = input.nextInt();

        while (i <= limite) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
            i++;
        }

        input.close();
    }
}

