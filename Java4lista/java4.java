
import java.util.Scanner;

        private static Scanner input = new Scanner(System.in);

        public static void main(String[] args) {
            int idade;
            String categoria;

            System.out.println("Digite a idade do nadador:");
            idade = input.nextInt();

            categoria = (idade >= 5 && idade <= 7)
                    ? "Infantil"
                    : (idade >= 8 && idade <= 17)
                    ? "Juvenil"
                    : (idade >= 18)
                    ? "Sênior"
                    : "Idade inválida";

            System.out.println("Categoria: " + categoria);
        }


