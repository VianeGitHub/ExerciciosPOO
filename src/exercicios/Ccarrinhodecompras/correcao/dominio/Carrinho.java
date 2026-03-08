package exercicios.Ccarrinhodecompras.correcao.dominio;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private List<ItemCarrinho> itens = new ArrayList<>();

    public void adicionarItem(Produto produto, int quantidade) {

        ItemCarrinho item = new ItemCarrinho(produto, quantidade);
        itens.add(item);
    }

    public double calcularTotal() {

        double total = 0;

        for (ItemCarrinho item : itens) {
            total += item.calcularSubtotal();
        }

        return total;
    }

    public void imprimirCarrinho() {

        for (ItemCarrinho item : itens) {

            System.out.println("Produto: " + item.getProduto().getDescricao());
            System.out.println("Quantidade: " + item.getQuantidade());
            System.out.println("Subtotal: " + item.calcularSubtotal());
            System.out.println();
        }

        System.out.println("TOTAL: " + calcularTotal());
    }
}