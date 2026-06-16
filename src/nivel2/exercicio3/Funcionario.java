package nivel2.exercicio3;

public class Funcionario {

    public double salario;
    double bonus = 0.0;
    public double calcularBonus() {
        return bonus = 500.00;
    }

    public double calcularBonus(double percentual) {
        return salario = salario * (percentual / 100);
    }

    public void exibir() {
        System.out.printf("Bônus: %.2f\n", bonus);
        System.out.printf("Bônus percentual: %.2f\n", salario);
    }
}
