package nivel3.exercicio15;

import java.util.Locale;
import java.util.Scanner;

public class MainFuncionario {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        var motorista = new Motorista();
        var supervisor = new Supervisor();

        int opcao = 0;
        int funcao = 0;
        do {
            System.out.println("Gostaria de informar supervisor ou motorista? 1 - Motorista / 2 - Supervisor");
            funcao = sc.nextInt();

            if(funcao == 1) {
                System.out.println("Digite o nome: ");
                String nome = sc.next();
                motorista.setNome(nome);

                System.out.println("Digite o cargo: ");
                String cargo = sc.next();
                motorista.setCargo(cargo);

                System.out.println("Digite o salário: ");
                double salario = sc.nextDouble();
                motorista.setSalario(salario);

                System.out.println("Digite a quantidade de entrega(s): ");
                int quantidadeEntregas = sc.nextInt();
                motorista.setQuantidadeEntregas(quantidadeEntregas);

                System.out.println("Está trabalhando? S / N" );
                String trabalhar = sc.next();
                if(trabalhar.equals("S") && trabalhar.equalsIgnoreCase(trabalhar)) {
                    motorista.gerarRelatorio();
                    motorista.trabalhar(true);
                } else {
                    motorista.gerarRelatorio();
                    motorista.trabalhar(false);
                }

            }

        } while(opcao == 1);
    }
}