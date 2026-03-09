package exercicios.Dsistemadeestacionamento.correcao.dominio;

public class Vaga {

    private Veiculo veiculo;
    private boolean ocupada;

    public boolean estaLivre() {
        return !ocupada;
    }

    public void ocupar(Veiculo veiculo) {
        this.veiculo = veiculo;
        this.ocupada = true;
    }

    public void liberar() {
        this.veiculo = null;
        this.ocupada = false;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public boolean isOcupada() {
        return ocupada;
    }
}