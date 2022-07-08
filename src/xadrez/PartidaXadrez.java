package xadrez;

import tabuleiro.Peca;
import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;
import xadrez.xadrez.pecas.*;

public class PartidaXadrez {
    private Tabuleiro tabuleiro;

    public  PartidaXadrez(){
        tabuleiro = new Tabuleiro(8 ,8);
        iniciarPartida();
    }
    public PecaXadrez[][] getPecas() {
        PecaXadrez[][] mat = new PecaXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
        for(int i = 0; i<tabuleiro.getLinhas();i++){
            for(int j = 0; j<tabuleiro.getColunas();j++){
                mat[i][j]=(PecaXadrez)tabuleiro.peca(i,j);
            }
        }
        return mat;
    }

    public PecaXadrez movimentoXadrez(XadrezPosicao posicaoOrigem, XadrezPosicao posicaoDestino){
        Posicao origem = posicaoOrigem.toPosicao();
        Posicao destino = posicaoDestino.toPosicao();
        validarPosicaoOrigem(origem);
        Peca pecaCapturada = fazMovimento(origem,destino);
        return (PecaXadrez)pecaCapturada;
    }
    private Peca fazMovimento(Posicao origem, Posicao destino){
        Peca p = tabuleiro.removerPeca(origem);
        Peca pecaCapturada = tabuleiro.removerPeca(destino);
        tabuleiro.colocarPeca(p, destino);
        return pecaCapturada;
    }
    private void validarPosicaoOrigem(Posicao posicao){
        if(!tabuleiro.existeUmaPeca(posicao)){
            throw new XadrezException("Não existe peça na posição de origem!");
        }
    }
    private void colocarNovaPeca(char coluna,int linha,PecaXadrez peca){
        tabuleiro.colocarPeca(peca, new XadrezPosicao(coluna,linha).toPosicao());
    }

    private void iniciarPartida(){

        colocarNovaPeca('a', 8,new Torre(tabuleiro, Cor.BRANCO));
        colocarNovaPeca('h', 8,new Torre(tabuleiro, Cor.PRETO));

        colocarNovaPeca('b', 8,new Cavalo(tabuleiro, Cor.PRETO));
        colocarNovaPeca('g', 8,new Cavalo(tabuleiro, Cor.BRANCO));

        colocarNovaPeca('c', 8,new Bispo(tabuleiro, Cor.BRANCO));
        colocarNovaPeca('f', 8,new Bispo(tabuleiro, Cor.PRETO));

        colocarNovaPeca('d', 8,new Rei(tabuleiro, Cor.PRETO));
        colocarNovaPeca('e', 8,new Rainha(tabuleiro, Cor.BRANCO));

        colocarNovaPeca('a', 7,new Peao(tabuleiro, Cor.PRETO));
        colocarNovaPeca('b', 7,new Peao(tabuleiro, Cor.BRANCO));
        colocarNovaPeca('c', 7,new Peao(tabuleiro, Cor.PRETO));
        colocarNovaPeca('d', 7,new Peao(tabuleiro, Cor.BRANCO));
        colocarNovaPeca('e', 7,new Peao(tabuleiro, Cor.PRETO));
        colocarNovaPeca('f', 7,new Peao(tabuleiro, Cor.BRANCO));
        colocarNovaPeca('g', 7,new Peao(tabuleiro, Cor.PRETO));
        colocarNovaPeca('h', 7,new Peao(tabuleiro, Cor.BRANCO));




        colocarNovaPeca('h', 1,new Torre(tabuleiro, Cor.PRETO));
        colocarNovaPeca('a', 1,new Torre(tabuleiro, Cor.BRANCO));

        colocarNovaPeca('g', 1,new Cavalo(tabuleiro, Cor.BRANCO));
        colocarNovaPeca('b', 1,new Cavalo(tabuleiro, Cor.PRETO));

        colocarNovaPeca('f', 1,new Bispo(tabuleiro, Cor.PRETO));
        colocarNovaPeca('c', 1,new Bispo(tabuleiro, Cor.BRANCO));


        colocarNovaPeca('d', 1,new Rei(tabuleiro, Cor.BRANCO));
        colocarNovaPeca('e', 1,new Rainha(tabuleiro, Cor.PRETO));

        colocarNovaPeca('a', 2,new Peao(tabuleiro, Cor.BRANCO));
        colocarNovaPeca('b', 2,new Peao(tabuleiro, Cor.PRETO));
        colocarNovaPeca('c', 2,new Peao(tabuleiro, Cor.BRANCO));
        colocarNovaPeca('d', 2,new Peao(tabuleiro, Cor.PRETO));
        colocarNovaPeca('e', 2,new Peao(tabuleiro, Cor.BRANCO));
        colocarNovaPeca('f', 2,new Peao(tabuleiro, Cor.PRETO));
        colocarNovaPeca('g', 2,new Peao(tabuleiro, Cor.BRANCO));
        colocarNovaPeca('h', 2,new Peao(tabuleiro, Cor.PRETO));

    }
}
