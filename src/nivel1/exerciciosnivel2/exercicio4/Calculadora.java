package nivel1.exerciciosnivel2.exercicio4;

public class Calculadora {

    public double valor1 = 0;
    public double valor2 = 0;
    public double resultado = 0;
    public double somar(double valor1, double valor2) {
        return resultado = valor1 + valor2;
    }

    public double subtrair(double valor1, double valor2) {
        return resultado = valor1 - valor2;
    }

    public double dividir(double valor1, double valor2) {
        if(valor2 == 0) {
            return 0;
        }
        return resultado = valor1 / valor2;
    }

    public double multiplicar(double valor1, double valor2) {
        return resultado = valor1 * valor2;
    }

    public void exibirResultado() {
        System.out.printf("Resultado = %.2f\n",resultado);
    }
}
