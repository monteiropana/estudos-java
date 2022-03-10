package JogoDaVelha;

import java.util.Scanner;

public class JogoDaVelha {
    static Scanner scan = new Scanner(System.in);
    static char[][] tabuleiro = new char[3][3];
    static char jogador1 = 'X';
    static char jogador2 = 'O';

    public static void main(String[] args){
        
        boolean jogando = true;
        
        int rodada = 1;
        char peca = 'X';
        int[] jogada = new int[2];

        while (jogando) {
            System.out.println("Rodada " + rodada);

            if (rodada%2 == 0) {
                peca = jogador2;
                jogada = jogar("Jogador 2");
            } else {
                peca = jogador1;
                jogada = jogar("Jogador 1");
            }
            
            tabuleiro[jogada[0]][jogada[1]] = peca;
            
            mostraTabuleiro();
            
            if (checaVencedor(jogador1)) {
                System.out.println("jogador 1 VENCEU");
                jogando = false;
            } else if(checaVencedor(jogador2)) {
                System.out.println("jogador 2 VENCEU");
                jogando = false;
            }

            if (checaTabuleiroCheio()) {
                System.out.println("EMPATE");
                jogando = false;
            }

            rodada++;
        }
    }
    
    public static int[] jogar(String jogador) {
        int[] jogada = new int[2];

        boolean jogadaInvalida = true;
        
        while (jogadaInvalida) {
            boolean invalid = true;
            while (invalid) {
                System.out.println(jogador + ", digite a linha");
                jogada[0] = scan.nextInt();
                if (jogada[0] < 0 || jogada[0] > 2) {
                    System.out.println("Linha inválida");
                } else {
                    invalid = false;
                }
            }
            
            invalid = true;
            while (invalid) {
                System.out.println(jogador + ", digite a coluna");
                jogada[1] = scan.nextInt();
                if (jogada[1] < 0 || jogada[1] > 2) {
                    System.out.println("Coluna inválida");
                } else {
                    invalid = false;
                }
            }

            jogadaInvalida = validarJogada(jogada, tabuleiro);
            if (jogadaInvalida) {
                System.out.println("Jogada inválida");
            }
        }
            
        return jogada;
    }

    public static boolean validarJogada(int[] jogada, char[][] tabuleiro) {
        if (tabuleiro[jogada[0]][jogada[1]] != '\u0000') {
            return true;
        } else {
            return false;
        }
    }

    public static void mostraTabuleiro() {
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                System.out.printf("[ %c ]", tabuleiro[i][j]);
            }
            System.out.print("\n");
        }
    }

    public static boolean checaVencedor(char jogador) {
        for (int i = 0; i < 3; i++) {
            if (checaLinha(i, jogador)) {
                return true;
            }
        }

        for (int j = 0; j < 3; j++) {
            if (checaColuna(j, jogador)) {
                return true;
            }
        }

        if (checaDiagonalPrincipal(jogador)) {
            return true;
        }

        if (checaDiagonalSecundaria(jogador)) {
            return true;
        }

        return false;
    }

    public static boolean checaLinha(int linha, char peca) {
        int count = 0;
        for (int j = 0; j < tabuleiro[linha].length; j++) {
            if (tabuleiro[linha][j] == peca) {
                count++;
            }
        }
        return count == 3;
    }

    public static boolean checaColuna(int coluna, char peca) {
        int count = 0;
        for (int i = 0; i < tabuleiro.length; i++) {
            if (tabuleiro[i][coluna] == peca) {
                count++;
            }
        }
        return count == 3;
    }

    public static boolean checaDiagonalPrincipal(char peca) {
        int count = 0;
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro.length; j++) {
                if (i == j && tabuleiro[i][j] == peca) {
                    count++;
                }
            }
        }
        return count == 3;
    }
    
    public static boolean checaDiagonalSecundaria(char peca) {
        int count = 0;
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro.length; j++) {
                if (j == ((tabuleiro[i].length -1) - i) && tabuleiro[i][j] == peca) {
                    count++;
                }
            }
        }
        return count == 3;
    }
    
    public static boolean checaTabuleiroCheio() {
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro.length; j++) {
                if (tabuleiro[i][j] == '\u0000') {
                    return false;
                }
            }
        }
        return true;
    }
}
