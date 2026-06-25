package nivel3.exercicio12;

import java.lang.classfile.attribute.SourceFileAttribute;

public class ProdutoFisico implements Desconto {

    private double preco;
    private double precoComDesconto;

    public ProdutoFisico(double preco) {
        this.preco = preco;
    }

    @Override
    public void aplicarDesconto(double desconto) {
        double descontos = preco * (desconto / 100);
        this.precoComDesconto = preco - descontos;
    }

    public void exibirDados() {
        System.out.printf("Preço produto físico: R$ %.2f\n", precoComDesconto);
    }
}
