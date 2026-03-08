package exercicios.Ccarrinhodecompras.correcao.test;

import exercicios.Ccarrinhodecompras.correcao.dominio.Carrinho;
import exercicios.Ccarrinhodecompras.correcao.dominio.Produto;

public class CarrinhoCompraTest {

        public static void main(String[] args) {

            Produto p1 = new Produto("Suco Tang Laranja", 7.99);
            Produto p2 = new Produto("Suco Mid Limão", 2.99);

            Carrinho carrinho = new Carrinho();

            carrinho.adicionarItem(p1, 2);
            carrinho.adicionarItem(p2, 3);

            carrinho.imprimirCarrinho();
        }
}
