package _06FormModificado;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TabelaDeDados extends Usuario {

    //ATRIBUTOS DA TABELA
    private JFrame tabelaFrame;
    private JPanel tabelaPanel;
    protected ClientesModel tableModel = new ClientesModel();
    public JTable tabelaPrincipal;
    protected JScrollPane barraRolagem;
    protected FormularioDeClientes referenciaFormulario;


    //CONSTRUTOR DA TABELA
    public TabelaDeDados(FormularioDeClientes formularioDeClientes) {

        tabelaFrame = new JFrame("Tabela");
        tabelaPanel = new JPanel();
        tabelaFrame.setContentPane(tabelaPanel);
        tabelaPrincipal = new JTable(tableModel);
        tabelaPanel.add(tabelaPrincipal);
        barraRolagem = new JScrollPane(tabelaPrincipal);
        tabelaPanel.add(barraRolagem);

        tabelaFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tabelaFrame.pack();
        tabelaFrame.setVisible(true);

        tabelaPrincipal.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                if(e.getClickCount() == 2) {

                    if(formularioDeClientes == null) {
                        referenciaFormulario = new FormularioDeClientes();
                    } else {
                        Usuario usuario = tableModel.usuarios.get(tabelaPrincipal.getSelectedRow());
                        formularioDeClientes.atualizaFormulario(usuario);
                    }

                }

            }
        });

    }

}
