package exercicios.Bemprestimolivros.dominio;

public class Livro {

    private String nome;
    private int ano;
    private int quantidadeEstoque;

    public Livro(String nome, int ano, int quantidadeEstoque) {
        this.nome = nome;
        this.ano = ano;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome() {
        return nome;
    }

    public int getAno() {
        return ano;
    }

    public void diminuirEstoque() {
        if (quantidadeEstoque <= 0) {
            throw new RuntimeException("Livro sem estoque disponível");
        }
        quantidadeEstoque--;
    }

    public void aumentarEstoque() {
        quantidadeEstoque++;
    }
}