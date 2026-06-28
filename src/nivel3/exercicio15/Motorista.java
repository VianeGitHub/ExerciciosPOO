package nivel3.exercicio15;

public class Motorista extends Funcionario implements Relatorio {

    private int quantidadeEntregas = 0;

    @Override
    public void gerarRelatorio() {
        
    }

    // Getters e Setters
    public int getQuantidadeEntregas() {
        return this.quantidadeEntregas;
    }

    public void setQuantidadeEntregas(int quantidadeEntregas) {
        this.quantidadeEntregas = quantidadeEntregas;
    }
}
