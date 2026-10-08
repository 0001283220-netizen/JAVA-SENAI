package Javalista6;

import java.util.Scanner;

public class java12 {


        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            String senha;

            System.out.print("Digite a senha: ");
            senha = input.nextLine();

            while (!senha.equals("1234")) {
                System.out.println("Senha Incorreta, tente novamente");
                System.out.print("Digite a senha: ");
                senha = input.nextLine();
            }

            System.out.println("Senha correta!");

            input.close();
        }
    }

