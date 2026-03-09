package exercicios.Dsistemadeestacionamento.dominio;

public class Vaga {

    private Veiculo veiculo;
    private int quantidadeDeVagas;
    private final int limiteDeVagas = 3;

    public Vaga(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    // Método para adicionar um valor a vaga, quando houver registro de entrada do veículo no estacionamento
    public int adicionarVaga() {
        return this.quantidadeDeVagas++;
    }

    // Método para remover uma vaga, quando houver registro de saída do veículo no estacionamento
    public int removerVaga() {
        return this.quantidadeDeVagas--;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public int  getQuantidadeDeVagas() {
        return quantidadeDeVagas;
    }
}