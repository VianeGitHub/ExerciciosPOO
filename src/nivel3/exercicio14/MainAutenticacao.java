package nivel3.exercicio14;

import java.util.Locale;

public class MainAutenticacao {
    static void main() {

        Locale.setDefault(Locale.US);

        var usuario = new Usuario("user", "123");
        usuario.login();

        System.out.println();

        var administrador = new Administrador("administrador", "1234");
        administrador.login();
    }
}
