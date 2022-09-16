package _06FormModificado;

import javax.swing.*;
import javax.swing.table.TableColumn;
import java.awt.*;

public class TabelaDoFormulario extends JFrame {
    private JPanel tabelaPanel1;
    public JTable tabelaPrincipal;
    private JScrollPane barraRolagem;
    protected ClientesModel tableModel = new ClientesModel();

    public TabelaDoFormulario(FormularioDeClientes formularioDeClientes) {

        setContentPane(tabelaPanel1);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tabelaPrincipal.setModel(tableModel);
        TableColumn colunaDosBotoes = tabelaPrincipal.getColumnModel().getColumn(5);
        colunaDosBotoes.setCellRenderer(new BotoesRenderer());
        colunaDosBotoes.setCellEditor(new BotoesEditor(tabelaPrincipal, formularioDeClientes, tableModel));
        colunaDosBotoes.setPreferredWidth(140);
        tabelaPrincipal.setRowHeight(35);

        Dimension dimensaoFrame = new Dimension(620, 360);
        setMinimumSize(dimensaoFrame);
        pack();
        setVisible(true);

    }

}