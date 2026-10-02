import java.util.Scanner;
        private static Scanner input = new Scanner(System.in);

        public static void main(String[] args) {
            double valorCompra;
            double desconto;
            double valorFinal;

            System.out.println("Insira o valor total da compra:");
            valorCompra = input.nextDouble();

            if (valorCompra <= 200) {
                desconto = valorCompra * 0.05;
            } else if (valorCompra <= 500) {
                desconto = valorCompra * 0.10;
            } else {
                desconto = valorCompra * 0.15;
            }
            valorFinal = valorCompra - desconto;

            System.out.println("Valor da compra: R$ " + valorCompra);
            System.out.println("Desconto: R$ " + desconto);
            System.out.println("Valor final da compra: R$ " + valorFinal);
        }
