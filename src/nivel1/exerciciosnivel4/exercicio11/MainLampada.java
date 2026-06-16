package nivel1.exerciciosnivel4.exercicio11;

import java.util.Locale;

public class MainLampada {
    static void main() {

        Locale.setDefault(Locale.US);

        var lampada = new Lampada();

        lampada.ligar();
        lampada.mostrarEstado();
        lampada.desligar();
        lampada.mostrarEstado();

    }
}
