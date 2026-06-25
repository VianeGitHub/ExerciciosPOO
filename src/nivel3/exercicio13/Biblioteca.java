package nivel3.exercicio13;

public class Biblioteca {

    private String nome;
    private String detalhes;
    private int numeroPaginas;

    public void exibirDetalhes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Detalhes: " + getDetalhes());
        System.out.println("Páginas: " + getNumeroPaginas());
    }

    // Getter e Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
}
