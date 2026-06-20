package nivel2.exercicio2;

import java.util.Locale;

public class MainImpressora {
    static void main() {

        Locale.setDefault(Locale.US);

        var impressora = new Impressora();

        impressora.imprimir("Olá mundo");
        impressora.imprimir(10);
        impressora.imprimir(10.555);
        impressora.imprimir(false);
        impressora.exibir();
    }
}
