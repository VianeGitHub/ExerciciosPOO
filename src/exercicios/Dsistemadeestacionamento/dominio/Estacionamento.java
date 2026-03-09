package exercicios.Dsistemadeestacionamento.dominio;

import java.util.ArrayList;
import java.util.List;

public class Estacionamento {

    private List<Vaga> vagas = new ArrayList<>();
    private int entrada;
    private int saida;

    public void adicionarVeiculo(Veiculo veiculo) {
        var vaga = new Vaga(veiculo);
        this.vagas.add(vaga);
    }

    public int entradaVaga() {
        entrada = 0;
        for(Vaga vaga : this.vagas) {
            entrada += vaga.adicionarVaga();
        }
        return entrada;
    }

    public int saidaVaga() {
        saida = 0;
        for(Vaga vaga : this.vagas) {
            saida -= vaga.removerVaga();
        }
        return saida;
    }

    public int vagasDisponiveis() {
        return entradaVaga() - saidaVaga();
    }

    public void imprimirDadosEstacionamento() {
        for(Vaga vaga : this.vagas) {
            System.out.println("Modelo: " + vaga.getVeiculo().getModelo());
            System.out.println("Placa: " + vaga.getVeiculo().getPlaca());
            System.out.println("Cor: " + vaga.getVeiculo().getCor());
        }
        System.out.println("Vagas disponíveis: " + vagasDisponiveis());
    }

}
