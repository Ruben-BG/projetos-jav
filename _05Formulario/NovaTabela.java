package _05Formulario;

import javax.swing.*;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class NovaTabela extends JFrame {

    //ATRIBUTOS GERAIS DA TABELA
    protected String[] colunasTabela = {"Nome", "Email", "Endereço", "Telefone", "CPF"};
    protected String[][] dadosUsuarios = {{"", "gggg", "", "", ""}};
    //public List usuarios;
    public JFrame tabelaFrame;
    public JTable tabelaTable;
    public String nomeUsuario, emailUsuario, enderecoUsuario;
    private String telefoneUsuario, cpfUsuario;

    //Construtor nova tabela
    public NovaTabela() {

        //Objeto Swing
        tabelaFrame = new JFrame("Tabela");
        tabelaFrame.setSize(360, 110);
        tabelaFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JPanel tabelaBase = new JPanel();
        tabelaBase.setLayout(new GridLayout());

        //Sobre a tabela
        tabelaTable = new JTable(dadosUsuarios, colunasTabela);
        tabelaBase.add(tabelaTable);
        JScrollPane barraRolagem = new JScrollPane(tabelaTable);
        tabelaBase.add(barraRolagem);

        //Finalização JFrame
        tabelaFrame.setContentPane(tabelaBase);
        tabelaFrame.pack();
        tabelaFrame.setVisible(true);
    }

    public void setDadosUsuarios(String nomeUsuario, String emailUsuario, String enderecoUsuario, String telefoneUsuario, String cpfUsuario) {

        dadosUsuarios[0][0] = nomeUsuario;
        dadosUsuarios[0][1] = emailUsuario;
        dadosUsuarios[0][2] = enderecoUsuario;
        dadosUsuarios[0][3] = telefoneUsuario;
        dadosUsuarios[0][4] = cpfUsuario;

    }

}
