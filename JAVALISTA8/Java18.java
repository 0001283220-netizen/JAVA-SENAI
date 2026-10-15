package JAVALISTA8;

import java.util.Scanner;

public class Java18

     {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int contador = 1;

            do {
                System.out.print("Digite o " + contador + "º numero inteiro: ");
                int num = sc.nextInt();

                int ultimoDigito = Math.abs(num % 10);

                if (ultimoDigito == 0) {
                    System.out.println("O ultimo digito e 0.");
                } else if (ultimoDigito == 5) {
                    System.out.println("O ultimo digito e 5.");
                } else {
                    System.out.println("O ultimo digito e outro valor.");
                }

                contador++;
            } while (contador <= 10);

            sc.close();
        }
    }

