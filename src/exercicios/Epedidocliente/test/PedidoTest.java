package exercicios.Epedidocliente.test;

import exercicios.Epedidocliente.dominio.Cliente;
import exercicios.Epedidocliente.dominio.Pedido;
import exercicios.Epedidocliente.dominio.Produto;

public class PedidoTest {
    static void main() {

        var cliente = new Cliente("Teste");
        var produto = new Produto("Coca-cola", 1.00);
        var pedido = new Pedido();
        pedido.adicionarPedido(cliente, produto, 2);
        pedido.adicionarPedido(cliente, produto, 3);
        pedido.imprimirDadosPedido();
    }
}
