package nivel2.exercicio8;

public class Carro {

    private String marca;
    private String modelo;
    private int ano;

    public Carro(String marca) {
        this.marca = marca;
    }

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Carro(int ano) {
        this("Toyota", "Corolla");
        this.ano = ano;
    }

    public void exibirDados() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
    }
}
