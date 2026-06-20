package nivel2.exercicio5;

import java.util.Locale;

public class MainPessoa {
    static void main() {

        Locale.setDefault(Locale.US);

        var pessoa = new Pessoa();
        var pessoa2 = new Pessoa("Vianê");
        var pessoa3 = new Pessoa(18);
        var pessoa4 = new Pessoa("Teste", 19, "São Paulo");
    }
}
