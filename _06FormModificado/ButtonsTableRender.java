package _06FormModificado;

import javax.swing.*;
import javax.swing.table.TableCellRenderer;
import java.awt.*;

public class ButtonsTableRender extends ButtonsPanel implements TableCellRenderer {

    public ButtonsTableRender() {
        super();
        setName("Table.cellRenderer");
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

        setBackground(isSelected ? table.getSelectionBackground(): table.getBackground());

        return this;

    }

}
