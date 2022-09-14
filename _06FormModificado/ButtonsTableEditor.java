package _06FormModificado;

import javax.swing.*;
import javax.swing.event.CellEditorListener;
import javax.swing.table.TableCellEditor;
import java.awt.*;
import java.awt.event.*;
import java.util.EventObject;

public class ButtonsTableEditor extends ButtonsPanel implements TableCellEditor {

    TabelaDoFormulario modeloUsado;

    public ButtonsTableEditor(final JTable tabela, FormularioDeClientes formularioDeClientes) {

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
