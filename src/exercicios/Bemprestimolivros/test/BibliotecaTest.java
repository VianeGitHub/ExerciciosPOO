package exercicios.Bemprestimolivros.test;

import exercicios.Bemprestimolivros.dominio.Emprestimo;
import exercicios.Bemprestimolivros.dominio.Livro;
import exercicios.Bemprestimolivros.dominio.Usuario;

public class BibliotecaTest {

    public static void main(String[] args) {

        Usuario usuario = new Usuario("Voney", 19);

        Livro livro1 = new Livro("Dom Quixote", 1987, 1);
        Livro livro2 = new Livro("Aladdin", 1999, 1);
        Livro livro3 = new Livro("Senhor dos Anéis", 1954, 1);
        Livro livro4 = new Livro("Cronicas de Narnia", 1900, 2);

        Emprestimo emprestimo = new Emprestimo(usuario);

        emprestimo.adicionarLivro(livro1);
        emprestimo.adicionarLivro(livro2);
        emprestimo.adicionarLivro(livro3);
        emprestimo.adicionarLivro(livro4);

        emprestimo.imprimirResumo();

        System.out.println("\nDevolvendo livro...\n");

        emprestimo.devolverLivro(livro1);

        emprestimo.imprimirResumo();
    }
}