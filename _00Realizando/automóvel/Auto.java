package automóvel;

public class Auto {

    // ATRIBUTOS
    private String nome, modelo;
    private Boolean liga, quebrado;
    private int dano;

    // MÉTODO CONSTRUTOR
    public Auto(String nome) {

        this.nome = nome;
        this.modelo = "nenhum";
        this.liga = false;
        this.quebrado = false;
        this.dano = 0;

    }

    // MÉTODOS GERAIS... get recebe e set define
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Boolean getLiga() {
        return this.liga;
    }

    public void setLiga(Boolean liga) {
        this.liga = liga;
    }

    public Boolean getQuebrado() {
        return this.quebrado;
    }

    public void setQuebrado(Boolean quebrado) {
        this.quebrado = quebrado;
    }

    public int getDano() {
        return this.dano;
    }

    public void setDano(int dano) {

        this.dano = dano;
        if (this.dano > 100) {

            this.dano = 100;

        } else if (this.dano < 0) {

            this.dano = 0;

        }

    }

    // MÉTODO FINAL
    public void info() {

        System.out.printf("\n\nSobre o Automóvel %s\n", this.nome);
        System.out.printf("Modelo...............: %s\n", this.modelo);
        System.out.printf("Liga?................. %s", this.liga ? "Sim\n" : "Não\n");
        System.out.printf("Quebrado?............. %s", this.quebrado ? "Sim\n" : "Não\n");

        if (this.quebrado == true) {

            System.out.printf("Dano (em porcentagem): %d\n", this.dano);

        }

    }

}