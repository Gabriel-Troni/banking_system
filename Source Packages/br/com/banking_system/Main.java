package br.com.banking_system;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Gabriel", "Troni", "12345678910", "12345678910", "endereço");
        Conta conta = new ContaCorrente(cliente, 1000.0);
        
        System.out.println("Nome do dono da conta: " + conta.getDono(cliente));
        System.out.println("Número da conta: " + conta.getNumero());
        System.out.println("Saldo inicial: " + conta.getSaldo());
        
        conta.deposita(1000);
        System.out.println("Saldo após depósito: " + conta.getSaldo());
        
        conta.saca(500);
        System.out.println("Saldo após saque: " + conta.getSaldo());
    }
}
