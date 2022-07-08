package tabuleiro;

public class Peca {
    //o uso do protected faz com que tal posição não fique visível na camada de xadrez
    protected Posicao posicao;
    private Tabuleiro tabuleiro;

    public Peca(Tabuleiro tabuleiro){
        this.tabuleiro=tabuleiro;
    }

    protected Tabuleiro getTabuleiro() {
        return tabuleiro;
    }
    //Somente classes e subclasses dentro do mesmo pacote poderá acessar o tabuleiro de uma peça
    //não existe set pois o tabuleiro não poderá ser alterado
}
