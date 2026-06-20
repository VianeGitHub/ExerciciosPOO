package nivel3.exercicio1;

import java.util.Locale;

public class MainPessoa {
    static void main() {

        Locale.setDefault(Locale.US);

        var aluno = new Aluno();

        aluno.setNome("Vianê");
        aluno.setIdade(28);
        aluno.setMatricula("123");
        aluno.apresentar();
        System.out.println("================================");
        var professor = new Professor();
        professor.setNome("Teste");
        professor.setIdade(40);
        professor.setDisciplina("Português");
        professor.apresentar();
    }
}
