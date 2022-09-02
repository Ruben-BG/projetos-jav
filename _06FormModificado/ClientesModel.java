package _06FormModificado;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class ClientesModel extends AbstractTableModel {
    //ATRIBUTOS TABLE MODEL
    protected List<TabelaDeDados> usuarios = new ArrayList<>();
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

    //IMPLEMENTAÇÃO QUE IDENTIFICA AS COLUNAS
    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
}
