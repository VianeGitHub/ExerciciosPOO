package nivel3.exercicio15;

public class Supervisor extends Funcionario implements Relatorio {

    private int quantidadeFuncionariosSupervisionados = 0;

    @Override
    public void gerarRelatorio() {

    }

    // Getters e Setters
    public int getQuantidadeFuncionariosSupervisionados() {
        return this.quantidadeFuncionariosSupervisionados;
    }

    public void setQuantidadeFuncionariosSupervisionados(int quantidadeFuncionariosSupervisionados) {
        this.quantidadeFuncionariosSupervisionados = quantidadeFuncionariosSupervisionados;
    }
}
