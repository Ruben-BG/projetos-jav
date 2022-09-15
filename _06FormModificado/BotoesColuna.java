package _06FormModificado;

import javax.swing.*;
import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.EventObject;
import java.util.List;

class BotoesPanel extends JPanel {

    public final List<JButton> buttons = new ArrayList<>();

    public BotoesPanel() {
        super();
        setOpaque(true);
        buttons.add(new JButton("editar"));
        buttons.add(new JButton("excluir"));
        for(JButton b: buttons) {
            b.setFocusable(false);
            b.setRolloverEnabled(false);
            add(b);
        }
    }

}

class BotoesEditor extends BotoesPanel implements TableCellEditor {

    public BotoesEditor(final JTable tabela) {

        super();

        MouseListener m1 = new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {

                ButtonModel m = ((JButton)e.getSource()).getModel();
                if(m.isPressed() && tabela.isRowSelected(tabela.getEditingRow()) && e.isControlDown()) {
                    setBackground(tabela.getBackground());
                }

            }
        };

        buttons.get(0).addMouseListener(m1);
        buttons.get(1).addMouseListener(m1);

        //métodos de ação para cada botão
        buttons.get(0).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //tabela.getModel().

            }
        });

    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        this.setBackground(table.getBackground());
        return null;
    }

    @Override
    public Object getCellEditorValue() {
        return "";
    }

    transient protected ChangeEvent changeEvent = null;

    @Override
    public boolean isCellEditable(EventObject anEvent) {
        return true;
    }

    @Override
    public boolean shouldSelectCell(EventObject anEvent) {
        return false;
    }

    @Override
    public boolean stopCellEditing() {
        return false;
    }

    @Override
    public void cancelCellEditing() {

    }

    @Override
    public void addCellEditorListener(CellEditorListener l) {

    }

    @Override
    public void removeCellEditorListener(CellEditorListener l) {

    }

}

public class BotoesColuna extends BotoesPanel implements TableCellRenderer {

    public BotoesColuna() {
        super();
        setName("Table.cellRenderer");
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

        setBackground(isSelected ? table.getSelectionBackground(): table.getBackground());

        return this;

    }

}
