package _06FormModificado;

import javax.swing.*;
import java.awt.event.*;

public class FormularioDeClientes extends JFrame {
    private JPanel formularioPanel;
    private JLabel logoLabel;
    private JLabel nomeLabel;
    public JTextField nomeTextField;
    private JTextField emailTextField;
    private JTextField enderecoTextField;
    private JTextField telefoneTextField;
    private JTextField cpfTextField;
    private JButton atualizarButton;
    private JLabel emailLabel;
    private JLabel enderecoLabel;
    private JLabel telefoneLabel;
    private JLabel cpfLabel;

    //ATRIBUTO DA TABELA E DO FORMULÁRIO
    //public TabelaDeDados novaTabela;
    public TabelaDoFormulario novaTabela;
    public Usuario novoUsuario;
    public FormularioDeClientes esseFormulario = this;

    //MÉTODOS GERAIS
    public void definicaoDados() {

        novoUsuario.setNomeUsuario(nomeTextField.getText());
        novoUsuario.setEmailUsuario(emailTextField.getText());
        novoUsuario.setEnderecoUsuario(enderecoTextField.getText());
        novoUsuario.setTelDoUsuario(Long.parseLong(telefoneTextField.getText()));
        novoUsuario.setCpfDoUsuario(Long.parseLong(cpfTextField.getText()));

    }

    public void limpaCampo() {

        nomeTextField.setText("");
        emailTextField.setText("");
        enderecoTextField.setText("");
        telefoneTextField.setText("");
        cpfTextField.setText("");

    }

    public void atualizaFormulario(Usuario usuario) {

        nomeTextField.setText(usuario.getNomeUsuario());
        emailTextField.setText(usuario.getEmailUsuario());
        enderecoTextField.setText(usuario.getEnderecoUsuario());
        telefoneTextField.setText(String.valueOf(usuario.getTelDoUsuario()));
        cpfTextField.setText(String.valueOf(usuario.getCpfDoUsuario()));

    }

    //CONSTRUTOR
    public FormularioDeClientes() {
        //introdução do JFrame
        setTitle("Cadastro de usuários");
        setContentPane(formularioPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //finalização da frame
        pack();
        setVisible(true);

        //ação do botão "atualizar"
        atualizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                novoUsuario = new Usuario(); //<- criação de um objeto usuário, para sempre criar um objeto ao usar o método addRow
                boolean telefoneNum = telefoneTextField.getText().chars().allMatch(Character::isDigit); //<- vê se o espaço "telefone" é numérico
                boolean cpfNum = cpfTextField.getText().chars().allMatch(Character::isDigit); //<- vê se o espaço "cpf" é numérico
                boolean emailCorreto = emailTextField.getText().contains("@"); //método de verificação se tem ou não @ no campo
                PopUp gerarAviso; //<- cria um objeto da classe gerar aviso

                if(!emailCorreto) {
                    gerarAviso = new PopUp();
                    gerarAviso.emailIncorreto();
                } else if(!telefoneNum && !cpfNum) {
                    gerarAviso = new PopUp();
                    gerarAviso.telECpfErrado();
                } else if(!telefoneNum) { //se o campo telefone estiver com algo além de número
                    gerarAviso = new PopUp();
                    gerarAviso.telefoneErrado();
                } else if(!cpfNum) {
                    gerarAviso = new PopUp();
                    gerarAviso.cpfErrado();
                } else {

                    if(novaTabela == null)
                        novaTabela = new TabelaDoFormulario();

                    definicaoDados();
                    novaTabela.tableModel.addRow(novoUsuario);
                    limpaCampo();

                }

            }
        });

        //ação do botão "excluir"
        /*excluirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(novaTabela.tabelaPrincipal.getSelectedRow() != 1) { //-1 é quando ela não está selecionada
                    novaTabela.tableModel.removeRow(novaTabela.tabelaPrincipal.getSelectedRow());
                }
            }
        });*/

        //ação do botão "alterar"
        /*alterarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(novaTabela.tabelaPrincipal.getSelectedRow() != - 1) {
                    //A introdução de dados se deu pela sequência valorObjeto, linhaSelecionada e coluna
                    novaTabela.tableModel.setValueAt(nomeTextField.getText(), novaTabela.tabelaPrincipal.getSelectedRow(), 0);
                    novaTabela.tableModel.setValueAt(emailTextField.getText(), novaTabela.tabelaPrincipal.getSelectedRow(), 1);
                    novaTabela.tableModel.setValueAt(enderecoTextField.getText(), novaTabela.tabelaPrincipal.getSelectedRow(), 2);
                    novaTabela.tableModel.setValueAt(telefoneTextField.getText(), novaTabela.tabelaPrincipal.getSelectedRow(), 3);
                    novaTabela.tableModel.setValueAt(cpfTextField.getText(), novaTabela.tabelaPrincipal.getSelectedRow(), 4);

                    limpaCampo();
                }
            }
        });*/

    }

    //MÉTODO PRINCIPAL
    public static void main(String[] args) {

        FormularioDeClientes novaFrame = new FormularioDeClientes();

    }

}
