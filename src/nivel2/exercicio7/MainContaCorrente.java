package nivel2.exercicio7;

import java.util.Locale;

public class MainContaCorrente {
    static void main() {

        Locale.setDefault(Locale.US);

        var contaCorrente = new ContaCorrente("Vianê", 10000.00);
        contaCorrente.sacar(500.50);
        contaCorrente.exibirDados();
        contaCorrente.depositar(10000);
        contaCorrente.exibirDados();
    }
}
