import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Cria o tabuleiro
        char[][] tabuleiro = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = ' ';
            }
        }
        // Exibe o tabuleiro
        exibirTabuleiro(tabuleiro);
        // Loop principal do jogo
        int jogadas = 0;
        boolean jogador1Venceu = false;
        boolean jogador2Venceu = false;

        while (true) {
            // Pega a jogada do jogador 1
            System.out.println("Jogador 1, digite sua jogada (1-9): ");
            int jogada1 = scanner.nextInt();
            // Verifica se a jogada é válida
            if (!jogadaValida(jogada1, tabuleiro)) {
                System.out.println("Jogada inválida. Tente novamente.");
                continue;
            }
            // Atualiza o tabuleiro
            tabuleiro[jogada1 / 3][jogada1 % 3] = 'X';
            jogadas++;
            // Exibe o tabuleiro
            exibirTabuleiro(tabuleiro);
            // Verifica se o jogador 1 ganhou
            jogador1Venceu = verificarVitoria(tabuleiro, 'X');
            if (jogador1Venceu || jogadas == 9) {
                break;
            }

            // Pega a jogada do jogador 2
            System.out.println("Jogador 2, digite sua jogada (1-9): ");
            int jogada2 = scanner.nextInt();
            // Verifica se a jogada é válida
            if (!jogadaValida(jogada2, tabuleiro)) {
                System.out.println("Jogada inválida. Tente novamente.");
                continue;
            }
            // Atualiza o tabuleiro
            tabuleiro[jogada2 / 3][jogada2 % 3] = 'O';
            jogadas++;
            // Exibe o tabuleiro
            exibirTabuleiro(tabuleiro);
            // Verifica se o jogador 2 ganhou
            jogador2Venceu = verificarVitoria(tabuleiro, 'O');
            if (jogador2Venceu) {
                break;
            }
        }

        if (jogador1Venceu) {
            System.out.println("Jogador 1 venceu!");
        } else if (jogador2Venceu) {
            System.out.println("Jogador 2 venceu!");
        } else {
            System.out.println("Empate!");
        }

        scanner.close();
    }

    private static boolean jogadaValida(int jogada, char[][] tabuleiro) {
        // Implemente a lógica para verificar se a jogada é válida
        // Dica: verifique se a posição no tabuleiro está vazia (espaço em branco)
        return false; // Altere isso de acordo com a lógica implementada
    }

    private static void exibirTabuleiro(char[][] tabuleiro) {
        // Implemente a lógica para exibir o tabuleiro
    }

    private static boolean verificarVitoria(char[][] tabuleiro, char jogador) {
        // Implemente a lógica para verificar se o jogador venceu
        return false; // Altere isso de acordo com a lógica implementada
    }
}
