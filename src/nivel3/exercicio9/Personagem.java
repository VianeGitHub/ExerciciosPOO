package nivel3.exercicio9;

public class Personagem {

    private String classe;
    private int atacar = 0;

    public int atacar(int atacar) {
        return this.atacar = atacar;
    }

    public void exibirDados() {
        System.out.println("Classe: " + getClasse());
        System.out.println("Ataque: " + getAtacar());
    }

    // Getters e Setters
    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getAtacar() {
        return atacar;
    }
}
