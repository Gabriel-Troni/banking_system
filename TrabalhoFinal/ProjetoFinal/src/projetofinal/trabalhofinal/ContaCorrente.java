/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhofinal;

/**
 *
 * @author Thiago
 */
public class ContaCorrente extends Conta implements Conta1{
    
    private double limite;

    public ContaCorrente(double saldo, int numero, String dono, double limite) {
        super(saldo, numero, dono);
        this.limite = limite;
    }
    

    @Override
    public boolean saca(double valor) {
        if(valor>0 && (this.saldo+limite>=valor)){
            saldo -= valor;
            return true;
        }else{
            return false;        
        }      
    }
    
   
    @Override
    public void remunera() {
       this.saldo += this.saldo*0.01;
    }
}   
    
