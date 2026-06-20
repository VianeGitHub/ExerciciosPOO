package nivel3.exercicio1;

public class Professor extends Pessoa {

    private String disciplina;

    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("Disciplina: " + getDisciplina());
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
