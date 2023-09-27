public class Contato {
    /* ATRIBUTOS */
    private String nome;
    private int telefone;

    /* CONSTRUTOR */
    public Contato(String nome, int telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    /* GETTERS */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    /* SETTERS */
    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
}
