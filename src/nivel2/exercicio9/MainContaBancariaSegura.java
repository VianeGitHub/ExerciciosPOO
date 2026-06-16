package nivel2.exercicio9;

import java.util.Locale;

public class MainContaBancariaSegura {
    static void main() {

        Locale.setDefault(Locale.US);

        var contaBancariaSegura = new ContaBancariaSegura(1000);
        contaBancariaSegura.saldoDisponivel();
        contaBancariaSegura.exibirSaldo();
    }
}
