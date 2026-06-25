package nivel3.exercicio12;

public class ProdutoDigital implements Desconto {

    private double preco;
    private double precoComDesconto;

    public ProdutoDigital(double preco) {
        this.preco = preco;
    }

    @Override
    public void aplicarDesconto(double desconto) {
        double descontos = preco * (desconto / 100);
        this.precoComDesconto = preco - descontos;
    }

    public void exibirDados() {
        System.out.printf("Preço produto digital: R$ %.2f\n", precoComDesconto);
    }
}
