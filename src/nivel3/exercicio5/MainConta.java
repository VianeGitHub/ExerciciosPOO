package nivel3.exercicio5;

import java.util.Locale;

public class MainConta {
    static void main() {

        Locale.setDefault(Locale.US);

        var contaCorrente = new ContaCorrente();

        contaCorrente.setNumeroConta("21654654");
        contaCorrente.setTitular("Eu");
        contaCorrente.depositar(2000);
        contaCorrente.exibirDados();
        contaCorrente.sacar(1000);
        contaCorrente.exibirDados();
        System.out.println("====================");
    }
}
