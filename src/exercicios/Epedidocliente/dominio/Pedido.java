package exercicios.Epedidocliente.dominio;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private List<ItemPedido> itens = new ArrayList<>();

    public void adicionarPedido(Cliente cliente, Produto produto,  int quantidade) {
        var itemPedido = new ItemPedido(cliente, produto, quantidade);
        itens.add(itemPedido);
    }
}
