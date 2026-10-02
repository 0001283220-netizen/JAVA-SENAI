

        private static Scanner input = new Scanner(System.in);

        public static void main(String[] args) {
            int vitoriasJogador1;
            int vitoriasJogador2;
            int pontosJogador1;
            int pontosJogador2;

            System.out.println("Insira o número de vitórias do jogador 1:");
            vitoriasJogador1 = input.nextInt();

            System.out.println("Insira o número de vitórias do jogador 2:");
            vitoriasJogador2 = input.nextInt();

            pontosJogador1 = vitoriasJogador1 * 10;
            pontosJogador2 = vitoriasJogador2 * 5;

            System.out.println("Pontuação final do jogador 1: "
                    + pontosJogador1 + " pontos");

            System.out.println("Pontuação final do jogador 2: "
                    + pontosJogador2 + " pontos");
        }
