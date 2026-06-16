package nivel2.exercicio4;

import java.util.Locale;

public class MainProduto {
    static void main() {

        Locale.setDefault(Locale.US);

        var produto = new Produto();
        var produto2 = new Produto("Sem descrição");
        var produto3 = new Produto("Sem descrição", 2.90);
    }
}
