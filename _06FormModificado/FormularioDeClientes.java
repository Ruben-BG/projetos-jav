package _06FormModificado;

import javax.swing.*;
import java.util.List;

public class FormularioDeClientes extends JFrame {
    private JPanel formularioPanel;
    private JLabel logoLabel;
    private JLabel nomeLabel;
    public JTextField nomeTextField;
    private JTextField emailTextField;
    private JTextField enderecoTextField;
    private JTextField telefoneTextField;
    private JTextField cpfTextField;
    public JButton salvarButton;
    private JLabel emailLabel;
    private JLabel enderecoLabel;
    private JLabel telefoneLabel;
    private JLabel cpfLabel;
    public JButton atualizarButton;

    //ATRIBUTO DA TABELA E DO FORMULÁRIO
    //public TabelaDeDados novaTabela;
    public TabelaDoFormulario novaTabela;
    public Usuario novoUsuario;
    public FormularioDeClientes esseFormulario = this;
    protected PopUp gerarAviso; //<- cria um objeto da classe gerar aviso

    //MÉTODOS GERAIS
    public void verificacoesPopUp() {

        boolean telefoneNum = telefoneTextField.getText().chars().allMatch(Character::isDigit); //<- vê se o espaço "telefone" é numérico
        boolean cpfNum = cpfTextField.getText().chars().allMatch(Character::isDigit); //<- vê se o espaço "cpf" é numérico
        boolean emailCorreto = emailTextField.getText().contains("@"); //método de verificação se tem ou não @ no campo

        if(nomeTextField.getText().equals("") || emailTextField.getText().equals("") || enderecoTextField.getText().equals("") || telefoneTextField.getText().equals("") || cpfTextField.getText().equals("")){
            gerarAviso = new PopUp();
            gerarAviso.espacoVazio();
        } else if(!emailCorreto) {
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
        }

    }

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
        atualizarButton.setVisible(false);

        //finalização da frame
        pack();
        setVisible(true);

        //ação do botão "salvar"
        salvarButton.addActionListener(e -> {

            novoUsuario = new Usuario(); //<- criação de um objeto usuário, para sempre criar um objeto ao usar o método addRow
            gerarAviso = null;
            verificacoesPopUp();

            if(novaTabela == null && gerarAviso == null)
                novaTabela = new TabelaDoFormulario(esseFormulario);
            else if(novaTabela != null && gerarAviso == null) {

                List<Usuario> listaDeDados = novaTabela.tableModel.usuarios;
                int quantidadeLinha = novaTabela.tabelaPrincipal.getRowCount(), linhaEscolhida = 0;
                while (linhaEscolhida < quantidadeLinha) {
                    if (listaDeDados.get(linhaEscolhida).getTelDoUsuario() == Long.parseLong(telefoneTextField.getText())) {
                        gerarAviso = new PopUp();
                        gerarAviso.numeroRepetido();
                        break;
                    } else if (listaDeDados.get(linhaEscolhida).getCpfDoUsuario() == Long.parseLong(cpfTextField.getText())) {
                        gerarAviso = new PopUp();
                        gerarAviso.cpfRepetido();
                        break;
                    } else {
                        linhaEscolhida++;
                    }
                }

            }

            if(gerarAviso == null) {

                definicaoDados();
                novaTabela.tableModel.addRow(novoUsuario);
                limpaCampo();

            }

        });

        //ação do botão "atualizar"
        atualizarButton.addActionListener(e -> {

            gerarAviso = null;
            verificacoesPopUp();
            if(novaTabela.tabelaPrincipal.getSelectedRow() != -1 && gerarAviso == null) {

                int linhaSelecionada = novaTabela.tabelaPrincipal.getSelectedRow();

                novaTabela.tableModel.setValueAt(nomeTextField.getText(), linhaSelecionada, 0);
                novaTabela.tableModel.setValueAt(emailTextField.getText(), linhaSelecionada, 1);
                novaTabela.tableModel.setValueAt(enderecoTextField.getText(), linhaSelecionada, 2);
                novaTabela.tableModel.setValueAt(cpfTextField.getText(), linhaSelecionada, 3);
                novaTabela.tableModel.setValueAt(telefoneTextField.getText(), linhaSelecionada, 4);
                limpaCampo();
                salvarButton.setVisible(true);
                atualizarButton.setVisible(false);

            }

        });

    }

    //MÉTODO PRINCIPAL
    public static void main(String[] args) {

        FormularioDeClientes novaFrame = new FormularioDeClientes();

    }

}
