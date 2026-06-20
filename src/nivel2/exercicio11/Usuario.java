package nivel2.exercicio11;

public class Usuario {

    private String nome;
    private String email;
    private int idade;

    public Usuario(String nome) {
        this.nome = nome;
    }

    public Usuario(String nome, String email) {
        this("User");
        this.email = email;
    }

    public Usuario(String nome, String email, int idade) {
        this("User", "@email.com");
        this.idade = idade;
    }

    public void atualizarDados(String nome) {
        this.nome = nome;
    }

    public void atualizarDados(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public void atualizarDados(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public boolean validarIdade() {
        if(this.idade < 1) {
            System.out.println("Idade inválida");
            return false;
        }
        return exibirDados();
    }

    public boolean exibirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Idade: " + getIdade());
        return true;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
