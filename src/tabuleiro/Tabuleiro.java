package tabuleiro;

public class Tabuleiro {
    private Integer linhas, colunas;
    private Peca[][] pecas;

    public Tabuleiro(Integer linhas, Integer colunas) {

        //Programação Defensiva
        if(linhas < 1 || colunas < 1){
            throw new TabuleiroException("Erro ao criar o tabuleiro, é necessário haja pelo menos uma linha e uma coluna");
        }
        this.linhas = linhas;
        this.colunas = colunas;
        pecas = new Peca[linhas][colunas];

    }

    public Integer getLinhas() {
        return linhas;
    }

    public Integer getColunas() {
        return colunas;
    }
    public Peca peca(Integer linhas, Integer colunas){
        //Programação defensiva
        if(!posicaoExistente(linhas,colunas)){
            throw new TabuleiroException("A posição não existe!");
        }
        return pecas[linhas][colunas];
    }
    public Peca peca(Posicao posicao){
        return pecas[posicao.getLinha()][posicao.getColuna()];
    }
    public void colocarPeca(Peca peca, Posicao posicao){
        //Programação defensiva
        if(existeUmaPeca(posicao)){
            throw new TabuleiroException("Já existe uma peça na posição: "+posicao);
        }
        pecas[posicao.getLinha()][posicao.getColuna()] = peca;
        peca.posicao=posicao;
    }
    public Peca removerPeca(Posicao posicao){
        if(!posicaoExistente(posicao)){
            throw new TabuleiroException("A posição não existe!");
        }
        if (existeUmaPeca(posicao)){
            return null;
        }
        Peca aux = peca(posicao);
        aux.posicao=null;
        pecas[posicao.getLinha()][posicao.getColuna()]=null;
        return aux;
    }
    private boolean posicaoExistente(Integer linha, Integer coluna){
        return linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas;
    }
    public boolean posicaoExistente(Posicao posicao){
        return posicaoExistente(posicao.getLinha(),posicao.getColuna());
        }
    public boolean existeUmaPeca(Posicao posicao){
       //if(!posicaoExistente(linhas,colunas)){
         //   throw new TabuleiroException("A posição não existe!");
       // }
        return peca(posicao)!=null;
    }
    }

