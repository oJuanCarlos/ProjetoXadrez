package app;

import xadrez.PartidaXadrez;
import xadrez.PecaXadrez;
import xadrez.XadrezPosicao;

import java.util.Scanner;

public class Programa {
    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);
        PartidaXadrez partidaXadrez = new PartidaXadrez();

        while (true){
            InterfaceUsuario.imprimeTabuleiro(partidaXadrez.getPecas());
            System.out.println();
            System.out.print("Origem: ");
            XadrezPosicao origem = InterfaceUsuario.leXadrezPosicao(sc);

            System.out.println();
            System.out.print("Destino: ");
            XadrezPosicao destino = InterfaceUsuario.leXadrezPosicao(sc);

            //PecaXadrez pecaCapturada = (PartidaXadrez).fazMovimento(origem,destino);
        }




    }
}
