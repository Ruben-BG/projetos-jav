package _06FormModificado;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class BotoesPanel extends JPanel {

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

    public List<JButton> getButtons() {
        return buttons;
    }

}