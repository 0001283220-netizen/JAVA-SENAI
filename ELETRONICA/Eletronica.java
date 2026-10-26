package ELETRONICA;

import java.util.Scanner;

public class Eletronica {

        public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);

            String equipamento;
            double potencia;
            int tensao;
            double corrente;
            String bitola;

            System.out.println("===== SISTEMA DE DIMENSIONAMENTO ELETRICO SENAI =====");

            // Entrada de dados
            System.out.print("Informe o nome do equipamento: ");
            equipamento = entrada.nextLine();

            System.out.print("Informe a potencia eletrica (Watts): ");
            potencia = entrada.nextDouble();

            System.out.print("Tensao da rede (127 ou 220 Volts): ");
            tensao = entrada.nextInt();

            // Validacao dos dados
            if (potencia <= 0 || (tensao != 127 && tensao != 220)) {
                System.out.println("Erro: informe uma potencia positiva e uma tensao de 127 ou 220 V.");
                entrada.close();
                return;
            }

            // Calculo da corrente eletrica
            corrente = potencia / tensao;

            // Selecao da bitola minima conforme a tabela da atividade
            if (corrente <= 15.5) {
                bitola = "1,5 mm2";
            } else if (corrente <= 21.0) {
                bitola = "2,5 mm2";
            } else if (corrente <= 28.0) {
                bitola = "4,0 mm2";
            } else if (corrente <= 36.0) {
                bitola = "6,0 mm2";
            } else if (corrente <= 50.0) {
                bitola = "10,0 mm2";
            } else {
                bitola = "16,0 mm2 ou superior";
            }

            // Exibicao dos resultados
            System.out.println();
            System.out.println("------------ RESULTADO DO CALCULO ------------");
            System.out.println("Equipamento: " + equipamento);
            System.out.println("Potencia Registrada: " + potencia + " W");
            System.out.println("Tensao da Rede: " + tensao + " V");
            System.out.printf("Corrente Eletrica Calculada: %.2f A%n", corrente);
            System.out.println("Bitola Minima do Condutor (Cobre): " + bitola);
            System.out.println("-----------------------------------------------");

            entrada.close();
        }

    }

