package nivel3.exercicio5;

public class Conta {

    private String numeroConta;
    private String titular;
    private double saldo;

    public void exibirDados() {
        System.out.println("Número da conta: " + getNumeroConta());
        System.out.println("Titular: " + getTitular());
        System.out.println("Saldo: " + getSaldo());
    }

    public double depositar(double deposito) {
        if(deposito < 1) {
            System.out.println("Depósito inválido");
            return 0;
        }
        return this.saldo += deposito;
    }

    public double sacar(double saque) {
        if(this.saldo < 0 || saque > this.saldo) {
            System.out.println("Saldo indisponível");
        }
        return this.saldo -= saque;
    }


    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }
}
