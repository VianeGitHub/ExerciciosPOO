package nivel2.exercicio11;

import java.util.Locale;

public class MainUsuario {
    static void main() {

        Locale.setDefault(Locale.US);

        var usuario = new Usuario("Teste", "teste@email.com", 29);
        usuario.atualizarDados("Teste", "teste@email.com", 12);
        usuario.validarIdade();
        usuario.atualizarDados("Vianê", "viane@email.com", 0);
        usuario.validarIdade();
    }
}
