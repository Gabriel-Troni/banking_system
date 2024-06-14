/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhofinal;

/**
 *
 * @author anaBeatriz
 */
public class ContaInvestimento extends Conta implements Conta1 {
    
    private double depositoMinimo;
    private double montanteMinimo;
    
    public ContaInvestimento(double saldo, int numero, String dono, double depositoMinimo, double montanteMinimo) {
        super(saldo, numero, dono);
        this.depositoMinimo = depositoMinimo;
        this.montanteMinimo = montanteMinimo;
    }
    
    @Override
    public boolean saca(double valor) {
        if(valor>0 && (this.saldo-valor >= montanteMinimo )){
            super.saca(valor);
            return true;
        }else{
            System.out.println("Saque não realizado. Verifique se o valor é válido ou se o saldo mínimo é atendido.");  
            return false;   
        }      
    }
    
    
    @Override
    public boolean deposita(double valor) {
        if(valor>0 && valor>=this.depositoMinimo){
            super.deposita(valor);
            return true;
        }else{
            System.out.println("Depósito não realizado. Verifique se o valor é válido ou atende ao depósito mínimo.");
            return false;
        }
    }
    
    @Override
    public void remunera() {
       this.saldo += this.saldo*0.02;
    }
}   
    
    
