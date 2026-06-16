package nivel1.exerciciosnivel4.exercicio9;

import java.util.Locale;

public class MainCarro {
    static void main() {

        Locale.setDefault(Locale.US);

        var carro = new Carro();
        carro.marca = "Hyundai";
        carro.modelo = "HB20";
        carro.acelerar(20);
        carro.acelerar(20);
        carro.frear(10);
        carro.exibirDados();
    }
}
