package _06FormModificado;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormularioDeClientes extends JFrame {
    private JPanel formularioPanel;
    private JLabel logoLabel;
    private JLabel nomeLabel;
    private JTextField nomeTextField;
    private JTextField emailTextField;
    private JTextField enderecoTextField;
    private JTextField telefoneTextField;
    private JTextField cpfTextField;
    private JButton cadastrarButton;
    private JLabel emailLabel;
    private JLabel enderecoLabel;
    private JLabel telefoneLabel;
    private JLabel cpfLabel;

    //ATRIBUTO DA TABELA
    protected TabelaDeDados novaTabela;

    //CONSTRUTOR
    public FormularioDeClientes() {

        //introdução do JFrame
        setTitle("Cadastro de usuários");
        setContentPane(formularioPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //finalização da frame
        pack();
        setVisible(true);

        //ação do botão "cadastrar"
        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (novaTabela == null) {

                    novaTabela = new TabelaDeDados();

                } else {

                }

            }
        });
    }

    //MÉTODO PRINCIPAL
    public static void main(String[] args) {

        FormularioDeClientes novoForm = new FormularioDeClientes();

    }

}
