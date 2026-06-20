package nivel2.exercicio10;

import java.util.Locale;

public class MainAluno {
    static void main() {

        Locale.setDefault(Locale.US);

        var aluno = new Aluno("Vianê", 11);
        aluno.validarNota();
    }
}
