package _06FormModificado;

import javax.swing.*;
import java.awt.*;

public class TabelaDeDados extends Usuarios {

    //ATRIBUTOS DA TABELA
    private JFrame tabelaFrame;
    private JPanel tabelaPanel;
    protected ClientesModel tableModel = new ClientesModel();
    public JTable tabelaPrincipal;
    protected JScrollPane barraRolagem;

    //CONSTRUTOR DA TABELA
    public TabelaDeDados() {

        tabelaFrame = new JFrame("Tabela");
        tabelaFrame.setLayout(new GridLayout());
        tabelaPanel = new JPanel();
        tabelaFrame.setContentPane(tabelaPanel);
        tabelaPrincipal = new JTable(tableModel);
        tabelaPanel.add(tabelaPrincipal);
        barraRolagem = new JScrollPane(tabelaPrincipal);
        tabelaPanel.add(barraRolagem);

        tabelaFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tabelaFrame.pack();
        tabelaFrame.setVisible(true);

    }

}
