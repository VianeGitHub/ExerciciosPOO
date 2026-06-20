package nivel3.exercicio1;

public class Aluno extends Pessoa {

    private String matricula;

    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("Matricula: " + getMatricula());
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
