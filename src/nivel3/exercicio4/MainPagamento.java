package nivel3.exercicio4;

public class MainPagamento {
    static void main() {

        var cartao = new Cartao();
        cartao.realizarPagamento();

        var pix = new Pix();
        pix.realizarPagamento();

        var dinheiro = new Dinheiro();
        dinheiro.realizarPagamento();
    }
}
