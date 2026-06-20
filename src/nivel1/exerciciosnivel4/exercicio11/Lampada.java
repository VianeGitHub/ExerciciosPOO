package nivel1.exerciciosnivel4.exercicio11;

public class Lampada {

    boolean ligada;

    public boolean ligar() {
        return ligada = true;
    }

    public boolean desligar() {
        return ligada = false;
    }

    public void mostrarEstado() {
        if(ligada == true) {
            System.out.println("Lâmpada ligada");
        } else {
            System.out.println("Lâmpada desligada");
        }
    }

}
