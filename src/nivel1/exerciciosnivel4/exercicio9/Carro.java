package nivel1.exerciciosnivel4.exercicio9;

public class Carro {

    public String marca;
    public String modelo;
    public int velocidadeAtual;

    public int acelerar(int velocidade) {
        return velocidadeAtual += velocidade;
    }

    public int frear(int velocidade) {
        return velocidadeAtual -= velocidade;
    }

    public void exibirDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidade atual: " + velocidadeAtual);
    }
}
