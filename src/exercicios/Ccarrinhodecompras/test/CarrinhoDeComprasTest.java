package exercicios.Ccarrinhodecompras.test;

import exercicios.Ccarrinhodecompras.dominio.Carrinho;
import exercicios.Ccarrinhodecompras.dominio.ItemCarrinho;
import exercicios.Ccarrinhodecompras.dominio.Produto;

import java.util.Arrays;
import java.util.List;

public class CarrinhoDeComprasTest {
    static void main() {

        var produto = new Produto("Suco Tang Laranja", 7.99);
        var produto2 = new Produto("Suco Mid Limão", 2.99);
        List<Produto> produtos = Arrays.asList(produto, produto2);
        var itemCarrinho = new ItemCarrinho(produtos);

        var carrinho = new Carrinho(itemCarrinho);
        carrinho.adicionarItemCarrinho(produto);
        carrinho.adicionarItemCarrinho(produto2);
        carrinho.calcularValorTotal();
        carrinho.imprimirDados();
    }
}
