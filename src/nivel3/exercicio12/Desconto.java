package nivel3.exercicio12;

public interface Desconto {

    default double aplicarDesconto() {
        return 0;
    }
}
