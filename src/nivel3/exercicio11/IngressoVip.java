package nivel3.exercicio11;

public class IngressoVip extends Cinema {

    private double adicional = 3;

    @Override
    public double calcularIngresso() {
        adicional = adicional / 100;
        double total = getPreco() * adicional;
        return getPreco() + total;
    }

    @Override
    public void exibirDados() {
        double preco = calcularIngresso();
        System.out.printf("Preço: %.2f\n", preco);
    }
}
