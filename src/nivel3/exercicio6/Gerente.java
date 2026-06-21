package nivel3.exercicio6;

public class Gerente extends Funcionario {

    private double bonus;

    @Override
    public double calcularSalario(double salario) {
        return super.calcularSalario(salario);
    }

    public double bonusSalario(double bonus) {
        return  this.bonus = getSalario() * (bonus / 100);
    }

    public double salarioFinal() {
        return getSalario() + getBonus();
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Bônus: " + getBonus());
        System.out.println("Salário com bônus: " + salarioFinal());
    }

    public double getBonus() {
        return bonus;
    }
}
