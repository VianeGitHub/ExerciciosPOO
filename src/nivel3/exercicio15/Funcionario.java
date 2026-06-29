package nivel3.exercicio15;

public class Funcionario {

    private String nome;
    private String cargo;
    private double salario;
    private boolean trabalhando;

    public boolean trabalhar(boolean trabalhando) {
        this.trabalhando = trabalhando;
        if(trabalhando == true) {
            System.out.println("O funcionário " + getNome() + " iniciou o trabalho");
            return true;
        }
        System.out.println("O funcionário " + getNome() + " não iniciou o trabalho");
        return false;
    }

    // Getters e Setters
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
