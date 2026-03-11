package exercicios.Epedidocliente.dominio;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private List<ItemPedido> itens = new ArrayList<>();

    public void adicionarPedido(Cliente cliente, Produto produto,  int quantidade) {
        var itemPedido = new ItemPedido(cliente, produto, quantidade);
        itens.add(itemPedido);
    }

    public double totalPedido() {
        double total = 0.0;
        for(var itemPedido : itens) {
            total += itemPedido.calcularSubTotalPedido();
        }
        return total;
    }

    public void imprimirDadosPedido() {
        for(var itemPedido : itens) {
            System.out.println("Cliente: " + itemPedido.getCliente().getNome());
            System.out.println("Produto: " + itemPedido.getProduto().getDescricao());
            System.out.println("Preço: " + itemPedido.getProduto().getPreco());
            System.out.println("Quantidade: " + itemPedido.getQuantidade());
        }
        System.out.println("Total de itens: " + totalPedido());
    }
}
