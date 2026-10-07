
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int numero;
        String resultado;

        System.out.println("Digite um número:");
        numero = input.nextInt();

        resultado = (numero % 2 == 0 && numero % 3 == 0 && numero % 5 == 0)
                ? "O número é divisível por 2, 3 e 5 ao mesmo tempo."
                : "O número não é divisível por 2, 3 e 5 ao mesmo tempo.";

        System.out.println(resultado);
    }

