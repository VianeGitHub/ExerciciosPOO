package nivel3.exercicio13;

public class Livro extends Biblioteca {

    private String livro = "Livro";

    @Override
    public void exibirDetalhes() {
        System.out.println(livro);
        super.exibirDetalhes();
    }
}
