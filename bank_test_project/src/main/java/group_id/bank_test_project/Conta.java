/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group_id.bank_test_project;

/**
 *
 * @author gabrieltroni
 */
public abstract class Conta 
    implements Conta1 {
    private Cliente cliente;
    private double saldo;
    private int numConta;
    
    private static int próxNumConta = 1;
    
    public Conta(Cliente cliente){
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
    public String getDono(Cliente cliente){
        return cliente.getNome();
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
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    @Override
    public abstract void remunera();
    
    private static int geraNumero(){
        return próxNumConta++;
    }
    
    public void vinculaCliente(Cliente cliente){
        this.cliente = cliente;
    }
}
