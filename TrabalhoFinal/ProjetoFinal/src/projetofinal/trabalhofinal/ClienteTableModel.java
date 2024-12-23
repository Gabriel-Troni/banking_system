/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package trabalhofinal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Rodolfo
 */
public class ClienteTableModel extends AbstractTableModel{
    private String[] colunas=new String[]{"Nome", "Sobrenome", "CPF","RG","Endereco"};

    private List<Cliente> lista=new ArrayList();
    private List<ContaCorrente> listaConta1=new ArrayList();
    private List<ContaInvestimento> listaConta2=new ArrayList();
    
    public ClienteTableModel(List<Cliente> lista){
        this.lista=lista;
    }

    public ClienteTableModel(){
    }


    @Override
    public int getRowCount() {
        return this.lista.size();
    }

    @Override
    public int getColumnCount() {
        return this.colunas.length;
    }

    @Override
    public String getColumnName(int index) {
        return this.colunas[index];
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Cliente customer = lista.get(rowIndex);
        switch (columnIndex) {
            case 0: return customer.getNome();//if column 1 (name)
            case 1: return customer.getSnome();//if column 2 (birthday)
            case 2: return customer.getCpf();
            case 3: return customer.getRg();
            case 4: return customer.getEndereco();
            default : return null;
        }
    }

    @Override
    public void setValueAt(Object value, int row, int col) {
        Cliente customer = lista.get(row);
        switch (col) {
            case 0:
                customer.setNome((String) value);
                break;
            case 1:
                customer.setSnome((String) value);
                break;
            case 2:
                customer.setCpf((String) value);
                break;
            case 3:
                customer.setRg((String) value);
                break;
            case 4:
                customer.setEndereco((String) value);
                break;
            default:
        }
        this.fireTableCellUpdated(row, col);
    }

    public boolean removeContato(Cliente customer) {
        int linha = this.lista.indexOf(customer);
        boolean result = this.lista.remove(customer);
        this.fireTableRowsDeleted(linha,linha);//update JTable
        return result;
    
    }
    
    
    public void removeCliente(int linha){
       this.lista.remove(linha); 
       this.fireTableRowsDeleted(linha,linha);
    }
    
    public void adicionaContato(Cliente customer) {
        this.lista.add(customer);
        this.fireTableRowsInserted(lista.size()-1,lista.size()-1);//update JTable
    }
    
    
        public void adicionaConta(ContaCorrente conta) {
        this.listaConta1.add(conta);
    }
        
                public void adicionaConta2(ContaInvestimento conta) {
        this.listaConta2.add(conta);
    }

    public void setListaContatos(List<Cliente> contatos) {
        this.lista = contatos;
        this.fireTableDataChanged();
    }

    public void limpaTabela() {
        int indice = lista.size()-1;
        if(indice<0)
            indice=0;
        this.lista = new ArrayList();
        this.fireTableRowsDeleted(0,indice);//update JTable
    }

    public Cliente getContato(int linha){
        return lista.get(linha);
    }

    
    void removeContatos(List<Cliente> listaParaExcluir) {
        listaParaExcluir.forEach((contato) -> {
            removeContato(contato);
        });
    }
    
    public boolean checkCpf(String cpf) {
        for (Cliente cliente : lista) {
            if (cliente.getCpf().equals(cpf)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean checkCpfExists(String cpf) {
        for (Cliente cliente : lista) {
            if (cliente.getCpf().equals(cpf)) {
                return true;
            }
        }
        return false;
    }


}
