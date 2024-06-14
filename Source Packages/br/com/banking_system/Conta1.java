/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.banking_system;


/**
 * Interface que define os métodos para operações da conta bancária.
 */
public interface Conta1 {

    /**
     * Deposita um valor na conta.
     *
     * @param valor o valor a ser depositado
     * @return true se o depósito for bem-sucedido, false caso contrário
     */
    boolean deposita(double valor);

    /**
     * Saca um valor da conta.
     *
     * @param valor o valor a ser sacado
     * @return true se o saque for bem-sucedido, false caso contrário (por exemplo, saldo insuficiente)
     */
    boolean saca(double valor);

    /**
     * Obtém o nome do dono da conta.
     *
     * @return o nome do dono da conta
     */
    String getDono(Cliente cliente);

    /**
     * Obtém o saldo atual da conta.
     *
     * @return o saldo atual
     */
    double getSaldo();

    /**
     * Obtém o número da conta.
     * 
     */
    
    void setSaldo(double saldo);
    
    int getNumero();

    /**
     * Aplica remuneração à conta, se aplicável.
     */
    void remunera();
}
