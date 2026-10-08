package Java4lista;

import java.util.Scanner;

public class java15 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int dia, mes;
        String resultado;

        System.out.println("Digite o dia de nascimento:");
        dia = input.nextInt();

        System.out.println("Digite o mês de nascimento:");
        mes = input.nextInt();

        resultado = ((mes == 3 && dia >= 21 && dia <= 31)
                || (mes == 4 && dia >= 1 && dia <= 19))
                ? "A pessoa é do signo de Áries."
                : "A pessoa não é do signo de Áries.";

        System.out.println(resultado);
    }
}

