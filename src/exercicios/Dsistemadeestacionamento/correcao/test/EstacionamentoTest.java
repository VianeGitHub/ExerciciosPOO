package exercicios.Dsistemadeestacionamento.correcao.test;

import exercicios.Dsistemadeestacionamento.correcao.dominio.Estacionamento;
import exercicios.Dsistemadeestacionamento.correcao.dominio.Veiculo;

public class EstacionamentoTest {

    public static void main(String[] args) {

        Veiculo v1 = new Veiculo("Gol", "AMD600SP", "Vermelho");
        Veiculo v2 = new Veiculo("Astra", "VM320SP", "Cinza");

        Estacionamento estacionamento = new Estacionamento(3);

        estacionamento.estacionar(v1);
        estacionamento.estacionar(v2);

        estacionamento.listarVagas();
    }
}
