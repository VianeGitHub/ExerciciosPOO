package exercicios.Epedidocliente.dominio;

public class ItemPedido {

    private Cliente cliente;
    private Produto produto;
    private int quantidade;

    public ItemPedido(Cliente cliente, Produto produto, int quantidade) {
        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public double calcularSubTotalPedido() {
        return produto.getPreco() * this.quantidade;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
