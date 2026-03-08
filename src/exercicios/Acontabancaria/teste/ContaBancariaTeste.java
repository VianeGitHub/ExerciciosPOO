package exercicios.Acontabancaria.teste;

import exercicios.Acontabancaria.dominio.ContaBancaria;

public class ContaBancariaTeste {
    static void main() {
        ContaBancaria conta = new ContaBancaria("12312313", "Teste Conta");

        conta.depositar(600);
        conta.sacar(500);
        conta.transferir("13215646", 50);
        conta.imprimirTitular();
        System.out.println("------------------------------------------");
        conta.imprimirTransferencia();
    }
}
