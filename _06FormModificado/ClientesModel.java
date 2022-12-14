package _06FormModificado;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.*;


public class ClientesModel extends AbstractTableModel {
    //ATRIBUTOS TABLE MODEL
    protected List<Usuario> usuarios = new ArrayList<>();
    protected String[] colunas = {"Nome", "Email", "Endereço", "Telefone", "CPF", "Ações"};

    //RETORNA A QUANTIDADE DE LINHAS DO MODELO
    @Override
    public int getRowCount() {
        return usuarios.size(); //<- responsável por dar o tamanho da lista
    }

    //RETORNA A QUANTIDADE DE COLUNAS PRESENTES NO MODELO
    @Override
    public int getColumnCount() {
        return colunas.length; //<- lê a quantidade de colunas
    }

    //PEGA UM VALOR DA TABELA
    @Override
    public Object getValueAt(int linha, int coluna) { //pegamos a coluna e linha, depois retornamos um valor

        switch (coluna) {
            case 0: return usuarios.get(linha).getNomeUsuario();
            case 1: return usuarios.get(linha).getEmailUsuario();
            case 2: return usuarios.get(linha).getEnderecoUsuario();
            case 3: return usuarios.get(linha).getTelDoUsuario();
            case 4: return usuarios.get(linha).getCpfDoUsuario();
        }
        return null;
    }

    @Override
    public void setValueAt(Object valor, int linha, int coluna) {

        //Usuario tabelaDados = this.usuarios.get(linha);

        switch (coluna) {
            case 0: usuarios.get(linha).setNomeUsuario(valor.toString()); break;
            case 1: usuarios.get(linha).setEmailUsuario(valor.toString()); break;
            case 2: usuarios.get(linha).setEnderecoUsuario(valor.toString()); break;
            case 3: usuarios.get(linha).setTelDoUsuario(Long.parseLong(valor.toString())); break;
            case 4: usuarios.get(linha).setCpfDoUsuario(Long.parseLong(valor.toString())); break;
            case 5: break;
            default: System.err.println("Índice da coluna inválido");
        }
        super.fireTableCellUpdated(linha, coluna);
    }

    //IMPLEMENTAÇÃO QUE IDENTIFICA AS COLUNAS
    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    //MÉTODO DE ADIÇÃO DE LINHA
    public void addRow(Usuario novaLinha) {

        this.usuarios.add(novaLinha);
        //EVENTO RESPONSÁVEL POR ATUALIZAR UMA TABELA QUANDO ESTA TEM ALTERAÇÃO
        this.fireTableDataChanged();//<- quando tem alteração ele atualiza a tabela
    }

    //MÉTODO DE REMOÇÃO
    public void removeRow(int linhaSelecionada) {

        this.usuarios.remove(linhaSelecionada);
        this.fireTableRowsDeleted(linhaSelecionada, linhaSelecionada); //<-função específica para deletar dados

    }

    @Override
    public Class<?> getColumnClass(int coluna) {
        return getValueAt(0, coluna).getClass();
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex == 5;
    }

}
