package nivel3.exercicio10;

public class MainSistemaDeTransporte {
    static void main() {

        var onibus = new Onibus();
        onibus.mover();

        var carro = new Carro();
        carro.mover();

        var moto = new Moto();
        moto.mover();
    }
}
