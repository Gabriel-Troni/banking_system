package br.com.banking_system;

public class ContaCorrente extends Conta {

    private Double limite;

    public ContaCorrente(Double limite) {
        this.limite = limite;
    }

    @Override
    public boolean saca(double valor) {
        if(valor > 0 && valor <= saldo + limite){
            saldo -= valor;
            return true;
        }
        return false;
    }
    
    @Override
    public void remunera() {
    	if(saldo >= 0) {
    		saldo = saldo*1.01;
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