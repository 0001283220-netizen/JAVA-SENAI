package Java4lista;

import java.util.Scanner;

public class java10 {

        private static Scanner input = new Scanner(System.in);

        public static void main(String[] args) {
            int inicio, fim, duracao;

            System.out.println("Digite a hora de início do jogo:");
            inicio = input.nextInt();

            System.out.println("Digite a hora de fim do jogo:");
            fim = input.nextInt();

            duracao = (fim > inicio)
                    ? fim - inicio
                    : (fim < inicio)
                    ? (24 - inicio) + fim
                    : 24;

            System.out.println("Duração do jogo: " + duracao + " horas");
        }
    }

