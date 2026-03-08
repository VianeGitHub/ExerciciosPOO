package exercicios.Ccarrinhodecompras.dominio;


import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private ItemCarrinho itemCarrinho;
    private List<Produto> produtos;
    private int quantidade;
    private double valorTotal;

    public Carrinho(ItemCarrinho itemCarrinho) {
        this.itemCarrinho = itemCarrinho;
        this.produtos = new ArrayList<>();
        this.quantidade = 0;
        this.valorTotal = 0;
    }

    public void adicionarItemCarrinho(Produto produto) {
        this.produtos.add(produto);
        this.quantidade++;
    }

    public void calcularValorTotal() {
        this.valorTotal = 0;
        for (Produto produto : this.produtos) {
            this.valorTotal += produto.getValor();
        }
    }

    public void imprimirDados() {
        for (Produto produto : this.produtos) {
            System.out.println("Produto: " + produto.getDescricao() + "\nValor: " + produto.getValor() + "\n");
        }
        System.out.println("Quantidade: " + this.quantidade);
        System.out.println("Valor total: " + this.valorTotal);
    }
}
