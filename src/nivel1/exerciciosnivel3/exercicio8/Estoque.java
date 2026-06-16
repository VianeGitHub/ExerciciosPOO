package nivel1.exerciciosnivel3.exercicio8;

public class Estoque {

    public String produto;
    public int quantidade;

    public int adicionar(int quantidades) {
        return quantidade += quantidades;
    }

    public int retirar(int quantidades) {
        return quantidade -= quantidades;
    }

    public void exibirDados() {
        System.out.printf("Produto: %s\n Quantidade: %d\n", produto, quantidade);
    }
}
