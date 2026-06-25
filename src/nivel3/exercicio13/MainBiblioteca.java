package nivel3.exercicio13;

public class MainBiblioteca {
    static void main() {

        var livro = new Livro();
        livro.setNome("Trono Divino");
        livro.setDetalhes("Aventura e ficção");
        livro.setNumeroPaginas(1992);
        livro.exibirDetalhes();
        System.out.println();
        var revista = new Revista();
        revista.setNome("Avon");
        revista.setDetalhes("Veja os melhores perfumes");
        revista.setNumeroPaginas(20);
        revista.exibirDetalhes();
    }
}
