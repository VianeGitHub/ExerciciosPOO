package nivel1.exerciciosnivel2.exercicio4;

import java.util.Locale;

public class MainCalculadora {
    static void main() {

        Locale.setDefault(Locale.US);

        var calculadora = new Calculadora();

        double valor1 = 20;
        double valor2 = 10;

        calculadora.dividir(valor1, valor2);
        calculadora.exibirResultado();

        calculadora.somar(valor1, valor2);
        calculadora.exibirResultado();

        calculadora.subtrair(valor1, valor2);
        calculadora.exibirResultado();

        calculadora.multiplicar(valor1, valor2);
        calculadora.exibirResultado();

    }
}
