
import java.util.Scanner;
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double temperatura;

        System.out.println("Insira a temperatura atual:");
        temperatura = input.nextDouble();

        if (temperatura < 18) {
            System.out.println("Ligar o aquecedor");
        } else if (temperatura <= 25) {
            System.out.println("Manter a temperatura atual");
        } else {
            System.out.println("Ligar o ar condicionado");
        }
    }

