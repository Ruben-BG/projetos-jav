package _06FormModificado;

import javax.swing.*;
import javax.swing.table.TableColumn;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TabelaDoFormulario extends JFrame {
    private JPanel tabelaPanel1;
    public JTable tabelaPrincipal;
    private JScrollPane barraRolagem;
    protected ClientesModel tableModel = new ClientesModel();

    public TabelaDoFormulario(FormularioDeClientes formularioDeClientes) {

        setContentPane(tabelaPanel1);
        setSize(200, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tabelaPrincipal.setModel(tableModel);
        TableColumn colunaDosBotoes;

        pack();
        setVisible(true);

    }

}