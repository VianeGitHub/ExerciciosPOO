package exercicios.Ccarrinhodecompras.dominio;

import java.util.ArrayList;
import java.util.List;

public class ItemCarrinho {

    private List<Produto> produtos = new ArrayList<>();

    public ItemCarrinho(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
