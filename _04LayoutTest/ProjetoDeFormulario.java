package _04LayoutTest;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProjetoDeFormulario extends JFrame {//formularin, nesse caso, é JFrame

    private JPanel panel1;
    private JTextField nomeText;
    private JTextField cpfText;
    private JButton enviarButton;
    private JLabel nomeLabel;
    private JLabel cpfLabel;

    public ProjetoDeFormulario() {

        //Comandos padrões
        setTitle("Formuláro");
        setSize(360, 180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        //Adicionando o painel de modo mais direto
        setContentPane(panel1);

        enviarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MensagemBasica mensagenzinha = new MensagemBasica();
            }
        });
    }



    public static void main(String[] args) {

        ProjetoDeFormulario form01 = new ProjetoDeFormulario();

    }

}
