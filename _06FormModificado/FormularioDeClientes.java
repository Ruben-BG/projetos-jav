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
    private JButton atualizarButton;
    private JLabel emailLabel;
    private JLabel enderecoLabel;
    private JLabel telefoneLabel;
    private JLabel cpfLabel;
    private JButton excluirButton;
    private JButton alterarButton;

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

        //ação do botão "atualizar"
        atualizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Usuarios novoUsuario = new Usuarios(); //<- criação de um objeto usuário, para sempre criar um objeto ao usar o método addRow
                boolean telefoneNum = telefoneTextField.getText().chars().allMatch(Character::isDigit); //<- vê se o espaço "telefone" é numérico
                boolean cpfNum = cpfTextField.getText().chars().allMatch(Character::isDigit); //<- vê se o espaço "cpf" é numérico
                boolean emailCorreto = emailTextField.getText().contains("@"); //método de verificação se tem ou não @ no campo
                popUp gerarAviso; //<- cria um objeto da classe gerar aviso

                if(!emailCorreto) {
                    gerarAviso = new popUp();
                    gerarAviso.emailIncorreto();
                } else if(!telefoneNum && !cpfNum) {
                    gerarAviso = new popUp();
                    gerarAviso.telECpfErrado();
                } else if(!telefoneNum) { //se o campo telefone estiver com algo além de número
                    gerarAviso = new popUp();
                    gerarAviso.telefoneErrado();
                } else if(!cpfNum) {
                    gerarAviso = new popUp();
                    gerarAviso.cpfErrado();
                } else if(telefoneNum == true && cpfNum == true && novaTabela == null) {

                    novaTabela = new TabelaDeDados();

                } else {

                    novoUsuario.setNomeUsuario(nomeTextField.getText());
                    novoUsuario.setEmailUsuario(emailTextField.getText());
                    novoUsuario.setEnderecoUsuario(enderecoTextField.getText());
                    novoUsuario.setTelDoUsuario(Long.parseLong(telefoneTextField.getText()));
                    novoUsuario.setCpfDoUsuario(Long.parseLong(cpfTextField.getText()));

                    //ADIÇÃO DOS VALORES NO TABLEMODEL
                    novaTabela.tableModel.addRow(novoUsuario);

                    //LIMPA CAMPO APÓS ADICIONAR USUÁRIO
                    nomeTextField.setText("");
                    emailTextField.setText("");
                    enderecoTextField.setText("");
                    telefoneTextField.setText("");
                    cpfTextField.setText("");

                }

            }
        });

        //ação do botão "excluir"
        excluirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(novaTabela.tabelaPrincipal.getSelectedRow() != 1) { //-1 é quando ela não está selecionada
                    novaTabela.tableModel.removeRow(novaTabela.tabelaPrincipal.getSelectedRow());
                }
            }
        });

        //ação do botão "alterar"
        alterarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(novaTabela.tabelaPrincipal.getSelectedRow() != - 1) {
                    //A introdução de dados se deu pela sequência valorObjeto, linhaSelecionada e coluna
                    novaTabela.tableModel.setValueAt(nomeTextField.getText(), novaTabela.tabelaPrincipal.getSelectedRow(), 0);
                    novaTabela.tableModel.setValueAt(emailTextField.getText(), novaTabela.tabelaPrincipal.getSelectedRow(), 1);
                    novaTabela.tableModel.setValueAt(enderecoTextField.getText(), novaTabela.tabelaPrincipal.getSelectedRow(), 2);
                    novaTabela.tableModel.setValueAt(telefoneTextField.getText(), novaTabela.tabelaPrincipal.getSelectedRow(), 3);
                    novaTabela.tableModel.setValueAt(cpfTextField.getText(), novaTabela.tabelaPrincipal.getSelectedRow(), 4);

                    //LIMPA CAMPO APÓS ALTERAR LINHA
                    nomeTextField.setText("");
                    emailTextField.setText("");
                    enderecoTextField.setText("");
                    telefoneTextField.setText("");
                    cpfTextField.setText("");

                }

            }
        });


    }

    //MÉTODO PRINCIPAL
    public static void main(String[] args) {

        FormularioDeClientes novoForm = new FormularioDeClientes();

    }

}
