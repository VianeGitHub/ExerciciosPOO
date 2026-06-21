package nivel3.exercicio6;

import java.util.Locale;

public class MainFuncionario {
    static void main() {

        Locale.setDefault(Locale.US);

        var gerente = new Gerente();
        gerente.setNome("Teste");
        gerente.calcularSalario(3000);
        gerente.bonusSalario(10);
        gerente.exibirDados();
    }
}
