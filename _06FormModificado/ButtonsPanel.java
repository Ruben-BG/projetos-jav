package _06FormModificado;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class ButtonsPanel extends JPanel {

    public final List<JButton> buttons = new ArrayList<>();

    public ButtonsPanel() {
        super();
        setOpaque(true);
        buttons.add(new JButton("editar"));
        buttons.add(new JButton("excluir"));
    }

}