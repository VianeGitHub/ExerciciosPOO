package nivel1.exerciciosnivel4.exercicio10;

import java.util.Locale;

public class MainAluno {
    static void main() {

        Locale.setDefault(Locale.US);

        var aluno = new Aluno();

        aluno.nome = "Vianê";
        aluno.calcularMedia(1, 6);
        aluno.exibirDados();
    }
}
