package _06FormModificado;

import javax.swing.*;
import javax.swing.table.TableCellEditor;
import java.awt.*;
import java.awt.event.*;
import java.util.List;

public class BotoesEditor extends AbstractCellEditor implements TableCellEditor {

    protected final BotoesPanel botoesPanel = new BotoesPanel();
    protected JTable tabela;

        class EditandoManipuladorDeParada extends MouseAdapter implements ActionListener {
            protected JTable tabela;

            @Override
            public void mouseClicked(MouseEvent e) {
                Object o = e.getSource(); //método getSource retorna uma referência ao Component que gerou o evento (nesse caso um JButton)
                if(o instanceof TableCellEditor) {//instanceof é um operador que permite testar se um objeto é uma instância de um tipo específico de uma class
                    actionPerformed(new ActionEvent(o, ActionEvent.ACTION_PERFORMED, ""));
                } else if(o instanceof JButton) {
                    ButtonModel m = ((JButton) e.getComponent()).getModel();
                    if(m.isPressed() && e.isControlDown()){
                        botoesPanel.setBackground(tabela.getBackground());
                    }
                }
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                EventQueue.invokeLater(BotoesEditor.this::fireEditingStopped);
            }
        }

    public BotoesEditor(JTable tabela, FormularioDeClientes referenciaForm, ClientesModel referenciaModel) {

        super();
        this.tabela = tabela;
        List<JButton> lista =  botoesPanel.getButtons();

        lista.get(0).addActionListener(e -> {
            //pegar e repassar os dados da linha para o formulário
            Usuario pegaDados = referenciaModel.usuarios.get(tabela.getSelectedRow());
            referenciaForm.esseFormulario.atualizaFormulario(pegaDados);
            //remover o botão salvar para adicionar o atualizar
            referenciaForm.esseFormulario.salvarButton.setVisible(false);
            referenciaForm.esseFormulario.atualizarButton.setVisible(true);
        });

        lista.get(1).addActionListener(e -> {
            referenciaModel.removeRow(referenciaForm.esseFormulario.novaTabela.tabelaPrincipal.getSelectedRow());
        });

        EditandoManipuladorDeParada manipulador = new EditandoManipuladorDeParada();
        for(JButton b : lista) {
            b.addMouseListener(manipulador);
            b.addActionListener(manipulador);
        }

        botoesPanel.addMouseListener(manipulador);

    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        botoesPanel.setBackground(table.getBackground());
        return botoesPanel;
    }

    @Override
    public Object getCellEditorValue() {
        return "";
    }

}