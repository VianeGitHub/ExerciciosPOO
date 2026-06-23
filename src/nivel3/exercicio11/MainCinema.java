package nivel3.exercicio11;

import java.util.Locale;

public class MainCinema {
    static void main() {

        Locale.setDefault(Locale.US);

        var ingresso = new Ingresso();
        ingresso.setPreco(2.99);
        ingresso.exibirDados();

        var ingressoVip = new IngressoVip();
        ingressoVip.setPreco(2.99);
        ingressoVip.exibirDados();
    }
}
