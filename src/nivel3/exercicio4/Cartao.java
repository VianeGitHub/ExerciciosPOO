package nivel3.exercicio4;

public class Cartao implements Pagamento {
    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento realizado em cartão");
    }
}
