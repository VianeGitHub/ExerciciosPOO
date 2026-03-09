package exercicios.Dsistemadeestacionamento.correcao.dominio;

import java.util.ArrayList;
import java.util.List;

public class Estacionamento {

    private List<Vaga> vagas = new ArrayList<>();

    public Estacionamento(int quantidadeVagas) {

        for (int i = 0; i < quantidadeVagas; i++) {
            vagas.add(new Vaga());
        }
    }

    public void estacionar(Veiculo veiculo) {

        for (Vaga vaga : vagas) {

            if (vaga.estaLivre()) {
                vaga.ocupar(veiculo);
                System.out.println("Veículo estacionado: " + veiculo.getModelo());
                return;
            }
        }

        System.out.println("Estacionamento cheio!");
    }

    public void listarVagas() {

        int numero = 1;

        for (Vaga vaga : vagas) {

            System.out.println("Vaga " + numero);

            if (vaga.isOcupada()) {
                Veiculo v = vaga.getVeiculo();

                System.out.println("Modelo: " + v.getModelo());
                System.out.println("Placa: " + v.getPlaca());
                System.out.println("Cor: " + v.getCor());
            } else {
                System.out.println("Livre");
            }

            System.out.println();
            numero++;
        }
    }
}
