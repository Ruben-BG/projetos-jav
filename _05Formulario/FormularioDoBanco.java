package _05Formulario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormularioDoBanco extends JFrame {
    private JTextField nomeInput;
    private JTextField emailInput;
    private JTextField enderecoInput;
    private JTextField telefoneInput;
    private JTextField cpfInput;
    private JButton cadastrarButton;
    private JLabel nomeLabel;
    private JLabel emailLabel;
    private JLabel enderecoLabel;
    private JLabel telefoneLabel;
    private JLabel cpfLabel;
    private JPanel basePanel;
    private JPanel logoPanel;
    private JPanel formularioPanel;
    private JLabel logoLabel;
    private JButton novaTabelaButton;

    //CONSTRUTOR FORMULÁRIO
    public FormularioDoBanco() {

        setTitle("Cadastro para formulário do banco");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //ativando panel
        setContentPane(basePanel);

        //finalização
        pack();
        setVisible(true);

        novaTabelaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                VisualizacaoTabela novaTabela = new VisualizacaoTabela();

            }
        });

    }

    //MÉTODO PRINCIPAL
    public static void main(String[] args) {

        //instanciando objeto
        FormularioDoBanco formularioPrincipal = new FormularioDoBanco();
        VisualizacaoTabela novaTabela = new VisualizacaoTabela();

    }

}
