package xadrez.xadrez.pecas;

import tabuleiro.Tabuleiro;
import xadrez.Cor;
import xadrez.PecaXadrez;

public class Peao extends PecaXadrez {
    public Peao(Tabuleiro tabuleiro, Cor cor){
        super(tabuleiro,cor);
    }
    @Override
    public String toString(){
        return "P";
    }
}
