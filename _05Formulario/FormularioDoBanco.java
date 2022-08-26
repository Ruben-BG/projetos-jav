package _05Formulario;

import javax.swing.*;
import javax.swing.event.TableModelListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class FormularioDoBanco extends JFrame implements TableModel {
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

    //ATRIBUTO E MÉTODO PARA REGISTRO DE PESSOA
    private String nomeUsuario = nomeInput.getText(), emailUsuario, enderecoUsuario;
    private int telefoneUsuario, cpfUsuario;

    //métodos referentes ao nome
    public String getNome() {
        return this.nomeUsuario;
    }

    public void setNome(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    //métodos referentes ao email
    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    //métodos referentes ao endereço
    public String getEnderecoUsuario() {
        return enderecoUsuario;
    }

    public void setEnderecoUsuario(String enderecoUsuario) {
        this.enderecoUsuario = enderecoUsuario;
    }

    //métodos referentes ao telefone
    public int getTelefoneUsuario() {
        return telefoneUsuario;
    }

    public void setTelefoneUsuario(int telefoneUsuario) {
        this.telefoneUsuario = telefoneUsuario;
    }

    //ATRIBUTOS GERAIS DA TABELA
    private String[] colunasTabela = {"Nome", "Email", "Endereço", "Telefone", "CPF"};
    public List<RegistroPessoa> usuarios;

        //instância para modelo de tabelas
    public void setUsuarios(List<RegistroPessoa> usuarios) {
        this.usuarios = usuarios;
    }
    public void novoUsuarios() {
        this.usuarios = new ArrayList<RegistroPessoa>();
    }

    //MÉTODOS DO MODELO DE TABELA
    @Override
    public int getRowCount() {
        return usuarios.size(); //retorna quantos elementos tem na lista
    }

    @Override
    public int getColumnCount() {
        return colunasTabela.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return colunasTabela[columnIndex];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }
        //método criação de tabela


    private void novaTabela() {
        //Objeto Swing
        JFrame tabelaFrame = new JFrame("Tabela");
        tabelaFrame.setSize(360, 110);
        tabelaFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JPanel tabelaBase = new JPanel();
        tabelaBase.setLayout(new GridLayout());

        //Sobre a tabela
        JTable tabelaPrinciapal = new JTable(10, 10);
        tabelaBase.add(tabelaPrinciapal);
        JScrollPane barraRolagem = new JScrollPane(tabelaPrinciapal);
        tabelaBase.add(barraRolagem);


        //Finalização JFrame
        tabelaFrame.setContentPane(tabelaBase);
        tabelaFrame.pack();
        tabelaFrame.setVisible(true);
    }


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

                novaTabela();

            }
        });

        //Ação do botão "Cadastrar"
        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                getNome();


            }
        });
    }

    //MÉTODO PRINCIPAL
    public static void main(String[] args) {

        //instanciando objeto
        FormularioDoBanco formularioPrincipal = new FormularioDoBanco();

    }

}
