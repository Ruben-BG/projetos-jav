package _05Formulario;

public class RegistroPessoa extends FormularioDoBanco {

    //essa classe contém os valores das pessoas
    private String nomeUsuario, emailUsuario, enderecoUsuario;
    private int telefoneUsuario, cpfUsuario;

    public RegistroPessoa() {

        nomeUsuario = "";
        emailUsuario = "";
        enderecoUsuario = "";
        telefoneUsuario = 0;
        cpfUsuario = 0;

    }

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
}
