package nivel2.exercicio9;

public class ContaBancariaSegura {

    private double saldo;

    public ContaBancariaSegura(double saldo) {
        this.saldo = saldo;
    }

    public double saldoDisponivel() {
        return this.saldo;
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual: " + this.saldo);
    }
}
