package nivel3.exercicio14;

public interface Autenticavel {
    default String login() {
        return "";
    }
}
