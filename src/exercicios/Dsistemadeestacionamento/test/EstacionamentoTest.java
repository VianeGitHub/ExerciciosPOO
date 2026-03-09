package exercicios.Dsistemadeestacionamento.test;

import exercicios.Dsistemadeestacionamento.dominio.Estacionamento;
import exercicios.Dsistemadeestacionamento.dominio.Veiculo;

public class EstacionamentoTest {
    static void main() {

        var veiculo1 = new Veiculo("Gol Bolinha", "AMD600SP", "Vermelho");
        var veiculo2 = new Veiculo("Astra", "VM320SP", "Cinza");

        var estacionamento = new Estacionamento();

        estacionamento.adicionarVeiculo(veiculo1);
        estacionamento.adicionarVeiculo(veiculo2);
        estacionamento.entradaVaga();
        estacionamento.imprimirDadosEstacionamento();
    }
}
