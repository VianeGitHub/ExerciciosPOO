package nivel2.exercicio1;

import java.util.Locale;

public class MainCalculadoraAvancada {
    static void main() {

        Locale.setDefault(Locale.US);

        var calculadoraAvancada = new CalculadoraAvancada();

        calculadoraAvancada.somar(10, 5);
        calculadoraAvancada.somar(10.5, 5.3);
        calculadoraAvancada.somar(1, 2, 3);
    }
}
