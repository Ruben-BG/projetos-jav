package _05Formulario;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class NovaTabela extends JFrame {

    //ATRIBUTOS GERAIS DA TABELA
    public JFrame tabelaFrame;
    public JTable tabelaBaseTable;
    public DefaultTableModel modeloTabela = new DefaultTableModel(); //<- classe que implementa a interface TableModel, fornecendo o controle dos dados da JTable.

    //CONSTRUTOR NOVA TABELA
    public NovaTabela() {

        //Objeto Swing
        tabelaFrame = new JFrame("Tabela");
        tabelaFrame.setSize(360, 110);
        tabelaFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JPanel tabelaPanel = new JPanel();
        tabelaPanel.setLayout(new GridLayout());

        //Sobre a tabela
        tabelaBaseTable = new JTable(modeloTabela); //<- referenciei o modelo da tabela com o DefaultTableModel
        modeloTabela.addColumn("Nome");
        modeloTabela.addColumn("Email");
        modeloTabela.addColumn("Endereço");
        modeloTabela.addColumn("Telefone");
        modeloTabela.addColumn("CPF");
        tabelaPanel.add(tabelaBaseTable);
        JScrollPane barraRolagem = new JScrollPane(tabelaBaseTable);
        tabelaPanel.add(barraRolagem);

        //Finalização JFrame
        tabelaFrame.setContentPane(tabelaPanel);
        tabelaFrame.pack();
        tabelaFrame.setVisible(true);
    }

}
