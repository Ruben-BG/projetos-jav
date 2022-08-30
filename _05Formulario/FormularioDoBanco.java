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
    private JButton gerarTabelaButton;

    //
    String telDoUsuario = nomeInput.getText(), cpdDoUsuario = cpfInput.getText();
    String nomeUsuario = nomeInput.getText(), emailUsuario = emailInput.getText(), enderecoUsuario = enderecoInput.getText();
    //protected int telefoneUsuario = Integer.valueOf(telDoUsuario), cpfUsuario = Integer.valueOf(cpdDoUsuario);

        //Atributo referenciador da classe NovaTabela
    NovaTabela tabelin;

    //CONSTRUTOR FORMULÁRIO
    public FormularioDoBanco() {

        setTitle("Cadastro para formulário do banco");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //ativando panel
        setContentPane(basePanel);

        //finalização
        pack();
        setVisible(true);

        //Ação do botão "Gerar Tabela"
        gerarTabelaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                tabelin = new NovaTabela();

            }
        });

        //Ação do botão "Cadastrar"
        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //verificação se JFrame foi instânciado
                if(tabelin == null) {

                    tabelin = new NovaTabela();
                    tabelin.setDadosUsuarios(nomeUsuario, emailUsuario, enderecoUsuario, telDoUsuario, cpdDoUsuario);

                } else {
                    tabelin.setDadosUsuarios(nomeUsuario, emailUsuario, enderecoUsuario, telDoUsuario, cpdDoUsuario);
                }


            }
        });
    }

    //MÉTODO PRINCIPAL
    public static void main(String[] args) {

        //instanciando objeto
        FormularioDoBanco formularioPrincipal = new FormularioDoBanco();

    }

}
