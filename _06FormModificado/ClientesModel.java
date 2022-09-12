package _06FormModificado;

import javax.swing.table.AbstractTableModel;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class ClientesModel extends AbstractTableModel {
    //ATRIBUTOS TABLE MODEL
    protected List<Usuario> usuarios = new ArrayList<>();
    protected String[] colunas = {"Nome", "Email", "Endereço", "Telefone", "CPF"};

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

        Usuario tabelaDados = usuarios.get(linha);

        switch (coluna) {
            case 0: tabelaDados.setNomeUsuario(valor.toString()); break;
            case 1: tabelaDados.setEmailUsuario(valor.toString()); break;
            case 2: tabelaDados.setEnderecoUsuario(valor.toString()); break;
            case 3: tabelaDados.setTelDoUsuario(Long.parseLong(valor.toString())); break;
            case 4: tabelaDados.setCpfDoUsuario(Long.parseLong(valor.toString())); break;
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

}
