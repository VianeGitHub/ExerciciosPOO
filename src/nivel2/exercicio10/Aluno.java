package nivel2.exercicio10;

public class Aluno {

    private String aluno;
    private double nota;

    public Aluno(String aluno, double nota) {
        this.aluno = aluno;
        this.nota = nota;
    }

    public boolean validarNota() {
        if(this.nota < 0 || this.nota > 10) {
            System.out.println("Nota inválida");
            return false;
        }
        System.out.println("Nota: " + this.nota);
        return true;
    }
}
