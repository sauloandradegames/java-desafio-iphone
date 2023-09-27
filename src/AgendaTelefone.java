import java.util.ArrayList;
import java.util.List;

public class AgendaTelefone {
    /* ATRIBUTOS */
    private List<Contato> listaContatos;
    private List<Contato> listaFavoritos;

    /* CONSTRUTOR */
    public AgendaTelefone() {
        this.listaContatos = new ArrayList<>();
        this.listaFavoritos = new ArrayList<>();
    }

    /* METODOS */
    public void adicionarContato(String nome, int telefone) {
        System.out.println("Contato " + nome + "-" + telefone + " adicionado");
    }

    public void removerContato(String nome) {
        System.out.println("Contato " + nome + " removido");
    }

    public void atualizarContato(String nome, String novoNome, int novoTelefone) {
        System.out.println("Contato " + nome + " atualizado.");
    }

    public void favoritarContato(String nome) {
        System.out.println("Contato " + nome + " adicionado a lista de contatos favoritos.");
    }

    public void abrirAgenda() {
        System.out.println("Abrindo agenda...");
        exibirContatos();
        exibirFavoritos();
    }

    private void exibirContatos() {
        System.out.println("Exibindo lista de contatos...");
    }

    private void exibirFavoritos() {
        System.out.println("Exibindo lista de contatos favoritos...");
    }
}
