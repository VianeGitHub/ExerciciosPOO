package nivel3.exercicio8;

public class MainSistemaDeNotificacao {
    static void main() {

        var sms = new Sms();
        sms.enviar();

        var email = new Email();
        email.enviar();

        var whatsapp = new Whatsapp();
        whatsapp.enviar();
    }
}
