package _06FormModificado;

public class Usuarios {

    //ATRIBUTOS DO USUARIO
    protected String nomeUsuario, emailUsuario, enderecoUsuario;
    protected int telUsuario, cpfUsuario;

    //SETTERS DO USUARIO
    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public void setEnderecoUsuario(String enderecoUsuario) {
        this.enderecoUsuario = enderecoUsuario;
    }

    public void setTelDoUsuario(int telUsuario) {
        this.telUsuario = telUsuario;
    }

    public void setCpfDoUsuario(int cpfUsuario) {
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

    public int getTelDoUsuario() {
        return telUsuario;
    }

    public int getCpfDoUsuario() {
        return cpfUsuario;
    }

}
