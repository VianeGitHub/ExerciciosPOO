package nivel2.exercicio7;

public class ContaCorrente {

    private String titular;
    private double saldo;

    public ContaCorrente(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public double depositar(double saldo) {
        return this.saldo += saldo;
    }

    public double sacar(double saldo) {
        return this.saldo -= saldo;
    }

    public void exibirDados() {
        System.out.println("Titular: " + this.titular);
        System.out.printf("Saldo: %.2f\n", this.saldo);
    }
}
