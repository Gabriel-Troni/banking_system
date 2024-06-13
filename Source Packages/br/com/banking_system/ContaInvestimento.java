package br.com.banking_system;

/* classe ContaInvestimento (herdar de Conta) */

/**
 *
 * @author anaBeatriz
 */
public class ContaInvestimento extends Conta implements Conta1 {
    
    private double depositoMinimo;
    private double montanteMinimo;
    
    public ContaInvestimento(Cliente cliente, double saldo, int numero, double depositoMinimo, double montanteMinimo) {
        super(cliente);
        this.depositoMinimo = depositoMinimo;
        this.montanteMinimo = montanteMinimo;
    }
    
    @Override
    public boolean saca(double valor) {
        double saldo = getSaldo();
        if(valor>0 && (saldo-valor >= montanteMinimo )){
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
       double saldo = getSaldo();
       setSaldo(saldo*1.02);
    }
}   
