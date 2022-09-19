package _06FormModificado;

import javax.swing.*;
import java.awt.*;

public class PopUp extends JFrame {

    JFrame frameDoAviso;
    JPanel painelAviso;
    JLabel mensagem = new JLabel();

    //CONSTRUTOR DA ABA DE POP-UP
    public PopUp() {

        frameDoAviso = new JFrame("Atenção");
        setSize(200, 200);
        painelAviso = new JPanel();
        setContentPane(painelAviso);
        mensagem.setFont(new Font("Roboto Light", Font.PLAIN, 14));
        painelAviso.add(mensagem);

    }
    public void finalFrame() {
        pack();
        setVisible(true);
    }

    //MÉTODO PARA EMAIL INCORRETO
    public void emailIncorreto() {
        mensagem.setText("Por favor insira o caractere especial '@' no campo de email");
        finalFrame();
    }

    //MÉTODO PARA TELEFONE INCORRETO
    public void telefoneErrado() {
        mensagem.setText("O valor atribuído ao campo de telefone deve ser numérico.");
        finalFrame();
    }

    //MÉTODO PARA CPF INCORRETO
    public void cpfErrado() {
        mensagem.setText("O valor atribuído ao campo de cpf deve ser numérico.");
        finalFrame();
    }

    //MÉTODO PARA TELEFONE E CPF INCORRETOS
    public void telECpfErrado() {
        mensagem.setText("Os valores atribuídos aos campos de telefone e CPF devem ser apenas numéricos.");
        finalFrame();
    }

    //MÉTODO PARA ALGUM ESPAÇO VAZIO
    public void espacoVazio() {
        mensagem.setText("Por favor preencha todos os campos");
        finalFrame();
    }

    //MÉTODO PARA VALORES REPETIDOS
    public void numeroRepetido() {
        mensagem.setText("Este número já esta cadastrado, por favor adicione um novo");
        finalFrame();
    }

    public void cpfRepetido() {
        mensagem.setText("Este CPF já está cadastrado, por favor adicione um novo");
    }

}
