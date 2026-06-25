package nivel3.exercicio12;

import java.util.Locale;

public class MainLojaOnline {
    static void main() {

        Locale.setDefault(Locale.US);

        var produtoFisico = new ProdutoFisico(3);
        produtoFisico.aplicarDesconto(10);
        produtoFisico.exibirDados();

        var produtoDigital = new ProdutoDigital(5);
        produtoDigital.aplicarDesconto(20);
        produtoDigital.exibirDados();
    }
}
