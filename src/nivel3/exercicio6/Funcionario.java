package nivel3.exercicio6;

public class Funcionario {

    private String nome;
    private double salario;

    public double calcularSalario(double salario) {
        return this.salario += salario;
    }

    public void exibirDados() {
        System.out.println("Nome: " + getNome());
        System.out.printf("Salário: %.2f\n", getSalario());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

}
