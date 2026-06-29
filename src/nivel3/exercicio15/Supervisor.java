package nivel3.exercicio15;

public class Supervisor extends Funcionario implements Relatorio {

    private int quantidadeFuncionariosSupervisionados = 0;

    @Override
    public void gerarRelatorio() {
        System.out.println("Nome: " + getNome());
        System.out.println("Cargo " + getCargo());
        System.out.println("Salário: " + getSalario());
        System.out.println("Quantidade de funcionários: " + getQuantidadeFuncionariosSupervisionados());
    }

    // Getters e Setters
    public int getQuantidadeFuncionariosSupervisionados() {
        return this.quantidadeFuncionariosSupervisionados;
    }

    public void setQuantidadeFuncionariosSupervisionados(int quantidadeFuncionariosSupervisionados) {
        this.quantidadeFuncionariosSupervisionados = quantidadeFuncionariosSupervisionados;
    }
}
