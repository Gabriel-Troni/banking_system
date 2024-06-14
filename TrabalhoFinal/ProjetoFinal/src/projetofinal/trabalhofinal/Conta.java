/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package trabalhofinal;

/**
 *
 * @author Gabriel
 */
public class Conta implements Conta1 {
    
    double saldo;
    int numero;
    String dono;
    
    
    
    public Conta(double saldo, int numero, String dono){
        
        this.saldo = saldo;
        this.numero = numero;
        this.dono = dono;   
    }


    @Override
    public boolean deposita(double valor) {
        if(valor>0){
            saldo += valor;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean saca(double valor) {
        if(valor>0 && (saldo>=valor)){
            saldo -= valor;
            return true;
        }else{
            return false;        
        }      
    }

    @Override
    public int getNumero() {
      return this.numero;
    }

    @Override
    public double getSaldo() {
       return this.saldo;
    }

    @Override
    public void remunera() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getDono() {
       return this.dono;
    }
}
