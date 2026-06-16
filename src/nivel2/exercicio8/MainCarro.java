package nivel2.exercicio8;

import java.util.Locale;

public class MainCarro {
    static void main() {

        Locale.setDefault(Locale.US);

        var carro = new Carro(2020);
        carro.exibirDados();
    }
}
