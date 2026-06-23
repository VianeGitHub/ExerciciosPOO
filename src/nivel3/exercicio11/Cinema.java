package nivel3.exercicio11;

public class Cinema {

    private double preco;

    public double calcularIngresso() {
        return this.preco;
    }

    public void exibirDados() {
        System.out.printf("Preço: %.2f\n", getPreco());
    }

   // Getters e Setters
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
