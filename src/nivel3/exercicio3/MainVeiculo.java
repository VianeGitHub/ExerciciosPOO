package nivel3.exercicio3;

public class MainVeiculo {
    static void main() {

        var carro = new Carro();
        carro.setModelo("Civic");
        carro.setMarca("Honda");
        carro.setAno(2020);
        carro.exibirInformacoes();

        System.out.println("=========================");

        var moto = new Moto();
        moto.setModelo("Falcon");
        moto.setMarca("Yamaha");
        moto.setAno(2018);
        moto.exibirInformacoes();
    }
}
