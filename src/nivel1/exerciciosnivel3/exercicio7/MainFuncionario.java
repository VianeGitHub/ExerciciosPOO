package nivel1.exerciciosnivel3.exercicio7;

import java.util.Locale;

public class MainFuncionario {
    static void main() {

        Locale.setDefault(Locale.US);
        var funcionario = new Funcionario();

        funcionario.nome = "Vianê";
        funcionario.salario = 3000;
        funcionario.aumentarSalario(10);
        funcionario.exibirDados();
    }
}
