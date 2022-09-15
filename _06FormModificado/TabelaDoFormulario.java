package _06FormModificado;

import javax.swing.*;
import javax.swing.table.TableColumn;

public class TabelaDoFormulario extends JFrame {
    private JPanel tabelaPanel1;
    public JTable tabelaPrincipal;
    private JScrollPane barraRolagem;
    protected ClientesModel tableModel = new ClientesModel();
    public TabelaDoFormulario esseFrame = this;

    public TabelaDoFormulario() {

        setContentPane(tabelaPanel1);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tabelaPrincipal.setModel(tableModel);
        TableColumn colunaDosBotoes = tabelaPrincipal.getColumnModel().getColumn(5);
        colunaDosBotoes.setCellRenderer(new BotoesColuna());
        colunaDosBotoes.setCellEditor(new BotoesEditor(tabelaPrincipal));
        colunaDosBotoes.setPreferredWidth(140);
        tabelaPrincipal.setRowHeight(35);

        pack();
        setVisible(true);

    }

    public void acaoEditar(FormularioDeClientes formularioDeClientes) {

        Usuario referenciaUsuario = tableModel.usuarios.get(tabelaPrincipal.getSelectedRow());
        formularioDeClientes.esseFormulario.atualizaFormulario(referenciaUsuario);

    }

}