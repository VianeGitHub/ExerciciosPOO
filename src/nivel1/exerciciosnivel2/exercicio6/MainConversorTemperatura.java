package nivel1.exerciciosnivel2.exercicio6;

import java.util.Locale;

public class MainConversorTemperatura {
    static void main() {

        Locale.setDefault(Locale.US);
        var conversorTemperatura = new ConversorTemperatura();

        conversorTemperatura.converterParaFarenheit(30);
        conversorTemperatura.exibirTemperatura();
    }
}
