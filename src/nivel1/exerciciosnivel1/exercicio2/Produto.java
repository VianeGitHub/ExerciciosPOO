package nivel1.exerciciosnivel1.exercicio2;

public class Produto {

    public String descricao;
    public double preco = 0;

    public void mostrarInformacoes() {

        System.out.println("Produto: " + descricao);
        System.out.printf("Preço: %.2f", preco);
    }
}
