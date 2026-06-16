package nivel1.exerciciosnivel3.exercicio7;

public class Funcionario {

    public String nome;
    public double salario = 0;

    public double aumentarSalario(double percentual) {
        return salario += salario * (percentual / 100);
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.printf("Salário: %.2f", salario);
    }
}
