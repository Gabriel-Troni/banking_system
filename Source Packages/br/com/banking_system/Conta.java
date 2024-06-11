/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.banking_system;



/*

Não ta   pronto ainda!!!




*/



/**
 *
 * @author gabrieltroni
 */
public abstract class Conta 
    implements Conta1 {
    private Cliente cliente;
    private double saldo;
    private int numConta;
    
    public void Conta(Cliente cliente){
        this.cliente = cliente;
        this.numConta = geraNumero();
        this.saldo = 0;
    }
    
    @Override
    public boolean deposita(double valor){
        if(valor>0){
            saldo += valor;
            return true;
        }
        return false;
    }
    
    @Override
    public boolean saca(double valor){
        if(valor > 0 && valor <= saldo){
            saldo -= valor;
            return true;
        }
        return false;
    }
    
    @Override
    public String getDono(){
        return Cliente.getNome();
    }
    
    @Override
    public int getNumero(){
        return numConta;
    }
    
    @Override
    public double getSaldo(){
        return saldo;
    }
    
    @Override
    public abstract boolean remunera();
    
    public int geraNumero(){
        return 0; // descobrir como faz isso
    }
    
    public void vinculaCliente(Cliente cliente){
        this.cliente = cliente;
    }
}
