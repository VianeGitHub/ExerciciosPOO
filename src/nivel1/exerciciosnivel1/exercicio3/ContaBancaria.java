package nivel1.exerciciosnivel1.exercicio3;

public class ContaBancaria {

    public String titular;
    public double saldo = 0;

    public void consultarSaldo() {

        System.out.println("Titular: " + titular);
        System.out.printf("Saldo atual: R$ %.2f", saldo);
    }
}
