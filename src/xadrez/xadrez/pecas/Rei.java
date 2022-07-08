package xadrez.xadrez.pecas;

import tabuleiro.Tabuleiro;
import xadrez.Cor;
import xadrez.PecaXadrez;

public class Rei extends PecaXadrez {
    public Rei(Tabuleiro tabuleiro, Cor cor){
        super(tabuleiro,cor);
    }
    @Override
    public String toString(){
        return "K";
    }
    //Rei nomeado de K (king) tendo em vista que a rainha está utilizando o "R"
}
