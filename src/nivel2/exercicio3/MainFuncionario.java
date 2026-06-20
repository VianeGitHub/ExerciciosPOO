package nivel2.exercicio3;

import java.util.Locale;

public class MainFuncionario {
    static void main() {

        Locale.setDefault(Locale.US);

        var funcionario = new Funcionario();

        funcionario.salario = 3000.00;
        funcionario.calcularBonus();
        funcionario.calcularBonus(10);
        funcionario.exibir();
    }
}
