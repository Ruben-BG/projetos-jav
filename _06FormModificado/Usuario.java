package _06FormModificado;

import javax.swing.*;

public class Usuario {//NOME DEVE SER SINGULAR, PLURAL VEM APENAS EM CLASSE DE LIST

    //ATRIBUTOS DO USUARIO
    protected String nomeUsuario, emailUsuario, enderecoUsuario;
    protected long telUsuario, cpfUsuario;

    //SETTERS DO USUARIO
    public void setNomeUsuario(String nomeUsuario) { this.nomeUsuario = nomeUsuario; }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public void setEnderecoUsuario(String enderecoUsuario) {
        this.enderecoUsuario = enderecoUsuario;
    }

    public void setTelDoUsuario(long telUsuario) {
        this.telUsuario = telUsuario;
    }

    public void setCpfDoUsuario(long cpfUsuario) {
        this.cpfUsuario = cpfUsuario;
    }

    //GETTERS DO USUARIO
    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public String getEnderecoUsuario() {
        return enderecoUsuario;
    }

    public Long getTelDoUsuario() {
        return telUsuario;
    }

    public Long getCpfDoUsuario() {
        return cpfUsuario;
    }

}
