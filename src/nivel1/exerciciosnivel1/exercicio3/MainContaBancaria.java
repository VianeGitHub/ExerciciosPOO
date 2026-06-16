package nivel1.exerciciosnivel1.exercicio3;

public class MainContaBancaria {
    static void main() {

        var contaBancaria = new ContaBancaria();

        contaBancaria.titular = "Vianê";
        contaBancaria.saldo = 500.00;
        contaBancaria.consultarSaldo();
    }
}
