package javalista9;

import java.util.Scanner;

public class Java20
{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int aprovados = 0;
            int reprovados = 0;

            for (int i = 1; i <= 10; i++) {
                System.out.print("Digite a nota do " + i + "º aluno: ");
                double nota = sc.nextDouble();

                if (nota >= 7) {
                    aprovados++;
                } else {
                    reprovados++;
                }
            }

            System.out.println("Quantidade de aprovados: " + aprovados);
            System.out.println("Quantidade de reprovados: " + reprovados);

            sc.close();
        }
    }

