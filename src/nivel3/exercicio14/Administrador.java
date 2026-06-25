package nivel3.exercicio14;

public class Administrador implements Autenticavel {

    private String nome;
    private String senha;

    public Administrador(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    @Override
    public String login() {

        if(nome.equals("adm") && senha.equals("1234")) {
            System.out.println("Login bem sucedido");
            return "";
        }
        System.out.println("Login mal sucedido");
        return "";
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
