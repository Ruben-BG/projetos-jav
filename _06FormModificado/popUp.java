package _06FormModificado;

import javax.swing.*;
import java.awt.*;

public class popUp extends JFrame {

    JFrame frameDoAviso;
    JPanel painelAviso;
    JLabel mensagem = new JLabel();

    //CONSTRUTOR DA ABA DE POP-UP
    public popUp() {

        frameDoAviso = new JFrame("Atenção");
        setSize(200, 200);
        painelAviso = new JPanel();
        setContentPane(painelAviso);
        mensagem.setFont(new Font("Roboto Light", Font.PLAIN, 14));
        painelAviso.add(mensagem);

    }

    public void telefoneErrado() {
        mensagem.setText("O valor atribuído ao campo de telefone deve ser numérico.");
        pack();
        setVisible(true);
    }

    public void cpfErrado() {
        mensagem.setText("O valor atribuído ao campo de cpf deve ser numérico.");
        pack();
        setVisible(true);
    }

    public void telECpfErrado() {
        mensagem.setText("Os valores atribuídos aos campos de telefone e CPF devem ser apenas numéricos.");
        pack();
        setVisible(true);
    }

}
