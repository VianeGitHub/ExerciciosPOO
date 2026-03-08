package exercicios.Acontabancaria.dominio;

public class ContaBancaria {

    private String numero;
    private String titular;
    private Double saldo = 0.00;

    // Construtores
    public ContaBancaria() {}

    public ContaBancaria(String numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }

    // Método imprimir os dados
    public void imprimirTitular() {
        System.out.println("Titular " + this.titular + "\n" + "Conta: " + this.numero + "\n" + "Saldo: " + this.saldo);
    }

    public void imprimirTransferencia() {
        System.out.println("Conta: " + this.numero + "\n" + "Transferencia: " + this.saldo);
    }

    // Método depositar
    public void depositar(double valor) {
        this.saldo += valor;
    }

    // Método sacar
    public void sacar(double valor) {
        if(this.saldo < valor) {
            return;
        }
        this.saldo -= valor;
    }

    // Método Transferir Saldo
    public void transferir(String numero, double valor) {
        if(this.saldo < valor) {
            return;
        }
        this.numero = numero;
        this.saldo -= valor;;
    }

    // Getters e Setters
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

}
