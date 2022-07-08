package xadrez.xadrez.pecas;

import tabuleiro.Tabuleiro;
import xadrez.Cor;
import xadrez.PecaXadrez;

public class Cavalo extends PecaXadrez {
    public Cavalo(Tabuleiro tabuleiro, Cor cor){
        super(tabuleiro,cor);
    }
    @Override
    public String toString(){
        return "C";
    }
}
