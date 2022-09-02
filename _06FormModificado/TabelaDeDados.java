package _06FormModificado;

import javax.swing.*;
import java.awt.*;

public class TabelaDeDados {

    //ATRIBUTOS DA TABELA
    private JFrame tabelaFrame;
    private JPanel tabelaPanel;
    private JTable tabelaPrincipal;
    protected ClientesModel tableModel = new ClientesModel();

    //CONSTRUTOR
    public TabelaDeDados() {

        tabelaFrame = new JFrame("Tabela");
        tabelaFrame.setLayout(new GridLayout());
        tabelaPanel = new JPanel();
        tabelaFrame.setContentPane(tabelaPanel);
        tabelaPrincipal = new JTable(tableModel);
        tabelaPanel.add(tabelaPrincipal);

        tabelaFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tabelaFrame.pack();
        tabelaFrame.setVisible(true);

    }

    //ATRIBUTOS DO USUARIO
    protected String nomeUsuario, emailUsuario, enderecoUsuario;
    protected int telDoUsuario, cpfDoUsuario;

    //MÉTODOS SET DO USUÁRIO
    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public void setEnderecoUsuario(String enderecoUsuario) {
        this.enderecoUsuario = enderecoUsuario;
    }

    public void setTelDoUsuario(int telDoUsuario) {
        this.telDoUsuario = telDoUsuario;
    }

    public void setCpfDoUsuario(int cpfDoUsuario) {
        this.cpfDoUsuario = cpfDoUsuario;
    }

    //MÉTODOS GET DO USUÁRIO
    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public String getEnderecoUsuario() {
        return enderecoUsuario;
    }

    public int getTelDoUsuario() {
        return telDoUsuario;
    }

    public int getCpfDoUsuario() {
        return cpfDoUsuario;
    }
}
