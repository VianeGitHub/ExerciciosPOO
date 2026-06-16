package nivel2.exercicio5;

public class Pessoa {

    public Pessoa() {}

    public Pessoa(String nome) {
        System.out.println("Nome: " + nome);
    }

    public Pessoa(int idade) {
        System.out.println("Idade: " + idade);
    }

    public Pessoa(String nome, int idade, String cidade) {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.printf("Cidade: " + cidade);
    }
}
