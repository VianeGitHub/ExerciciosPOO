package nivel3.exercicio13;

public class Revista extends Biblioteca {

    private String revista = "Revista";

    @Override
    public void exibirDetalhes() {
        System.out.println(revista);
        super.exibirDetalhes();
    }
}
