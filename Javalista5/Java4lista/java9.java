
        private static Scanner input = new Scanner(System.in);

        public static void main(String[] args) {
            char letra;
            String resultado;

            System.out.println("Digite uma letra:");
            letra = input.next().toLowerCase().charAt(0);

            resultado = (letra == 'a' || letra == 'e' || letra == 'i'
                    || letra == 'o' || letra == 'u')
                    ? "Vogal"
                    : "Consoante";

            System.out.println("Resultado: " + resultado);
        }

