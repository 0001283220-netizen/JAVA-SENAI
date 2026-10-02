package JAVASENAIHJ;

import java.util.Scanner;

public class atividade5lista2java {

        private static Scanner input = new Scanner(System.in);

        public static void main(String[] args) {
            double distancia;
            double consumo;
            double combustivel;

            System.out.println("Insira a distância da viagem em km:");
            distancia = input.nextDouble();

            System.out.println("Insira o consumo médio do carro em km/l:");
            consumo = input.nextDouble();

            combustivel = distancia / consumo;

            System.out.println("Quantidade de combustível necessária: "
                    + combustivel + " litros");
        }
    }
