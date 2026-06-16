package nivel1.exerciciosnivel1.exercicio1;

import java.util.Locale;

public class MainPessoa {
    static void main() {

        Locale.setDefault(Locale.US);

        var pessoa = new Pessoa();

        pessoa.nome = "Vianê";
        pessoa.idade = 28;

        pessoa.apresentar();
    }
}
