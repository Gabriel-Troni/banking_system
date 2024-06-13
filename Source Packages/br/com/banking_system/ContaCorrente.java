package br.com.banking_system;

public class ContaCorrente extends Conta {

    private Double limite;

    public ContaCorrente(Cliente cliente, Double limite) {
        super(cliente);
        this.limite = limite;
    }

    @Override
    public boolean saca(double valor) {
        double saldo = getSaldo();
        if(valor > 0 && valor <= saldo + limite){
            setSaldo(saldo - valor);
            return true;
        }
        return false;
    }
    
    @Override
    public void remunera() {
        double saldo = getSaldo(); 
    	if(saldo >= 0) {
    		setSaldo(saldo*1.01);
    	}
    }
    
    public boolean atualizaLimite(double valor) {
    	if(valor >= 0) {
    		limite = valor;
    		return true;
    	}
    	return false;
    }
    
    public double getLimite() {
    	return limite;
    }
}