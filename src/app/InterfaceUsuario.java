package app;

import xadrez.PartidaXadrez;
import xadrez.PecaXadrez;
import xadrez.XadrezPosicao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InterfaceUsuario {

    public static void imprimeTabuleiro(PecaXadrez[][] pecas){

        for (int i = 0; i<pecas.length; i++){
            System.out.print((8-i)+" ");

            for (int j = 0; j<pecas.length;j++){
                imprimePecas(pecas[i][j]);

            }
            System.out.println();
        }
        System.out.println("  a b c d e f g h");
    }

    public static XadrezPosicao leXadrezPosicao(Scanner sc){
        try{
            String s = sc.nextLine();
            char coluna = s.charAt(0);
            int linha = Integer.parseInt(s.substring(1));
            return new XadrezPosicao(coluna, linha);
        }
        catch (RuntimeException e){
            throw new InputMismatchException("Erro lendo a posição de xadrez. Valores válidos são a1 até h8");
        }
    }


    private static void imprimePecas(PecaXadrez pecas){
        if(pecas == null){
            System.out.print("-");
        }
        else {
            System.out.print(pecas);
        }
        System.out.print(" ");
    }

}
