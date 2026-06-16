package nivel2.exercicio4;

public class Produto {

    public Produto() {}

    public Produto(String descricao) {
        System.out.println("Produto: " + descricao);
    }

    public Produto(String descricao, double preco) {
        System.out.println("Produto: " + descricao);
        System.out.printf("Preço: %.2f\n", preco);
    }
}
