package nivel1.exerciciosnivel3.exercicio8;

import java.util.Locale;

public class MainEstoque {
    static void main() {

        Locale.setDefault(Locale.US);

        var estoque = new Estoque();

        estoque.produto = "Mouse Gamer";
        estoque.adicionar(10);
        estoque.exibirDados();
        estoque.retirar(5);
        estoque.exibirDados();
    }
}
