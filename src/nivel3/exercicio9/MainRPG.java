package nivel3.exercicio9;

public class MainRPG {
    static void main() {

        var guerreiro = new Guerreiro();
        guerreiro.setClasse("Guerreiro");
        guerreiro.atacar(100);
        guerreiro.exibirDados();

        var mago = new Mago();
        mago.setClasse("Mago");
        mago.atacar(140);
        mago.exibirDados();

        var arqueiro = new Arqueiro();
        arqueiro.setClasse("Arqueiro");
        arqueiro.atacar(200);
        arqueiro.exibirDados();
    }
}
