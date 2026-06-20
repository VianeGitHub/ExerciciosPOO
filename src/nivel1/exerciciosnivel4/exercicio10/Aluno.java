package nivel1.exerciciosnivel4.exercicio10;

public class Aluno {

    public String nome;
    public double nota1;
    public double nota2;
    double media = 0;

    public double calcularMedia(double nota1, double nota2) {
        return media = (nota1 + nota2) / 2;
    }

    public String verificarSituacao() {
        if(media >= 5 && media <=6) {
            return "Recuperação";
        } else if(media >= 7) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    public void exibirDados() {
        System.out.println("Aluno: " + nome);
        System.out.printf("Média: %.2f\n", media);
        System.out.println("Situação: " + verificarSituacao());
    }
}
