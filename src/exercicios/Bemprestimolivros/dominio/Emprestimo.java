package exercicios.Bemprestimolivros.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Emprestimo {

    private Usuario usuario;
    private List<Livro> livros = new ArrayList<>();
    private LocalDate dataEmprestimo;
    private LocalDate dataVencimento;

    public Emprestimo(Usuario usuario) {
        this.usuario = usuario;
        this.dataEmprestimo = LocalDate.now();
        this.dataVencimento = dataEmprestimo.plusDays(7);
    }

    public void adicionarLivro(Livro livro) {

        if (livros.size() >= 3) {
            throw new RuntimeException("Usuário não pode pegar mais de 3 livros");
        }

        livro.diminuirEstoque();
        livros.add(livro);
    }

    public void devolverLivro(Livro livro) {

        if (livros.remove(livro)) {
            livro.aumentarEstoque();
        }
    }

    public void imprimirResumo() {

        System.out.println("===== EMPRÉSTIMO =====");
        System.out.println("Usuário: " + usuario.getNome());
        System.out.println("Idade: " + usuario.getIdade());
        System.out.println("Data empréstimo: " + dataEmprestimo);
        System.out.println("Data vencimento: " + dataVencimento);

        System.out.println("\nLivros emprestados:");

        for (Livro livro : livros) {
            System.out.println("- " + livro.getNome() + " (" + livro.getAno() + ")");
        }
    }
}
