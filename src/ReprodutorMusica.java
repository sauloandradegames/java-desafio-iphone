import java.util.ArrayList;
import java.util.List;

public class ReprodutorMusica {
    /* ATRIBUTOS */
    private List<String> listaMusicas;

    /* CONSTRUTOR */
    public ReprodutorMusica() {
        this.listaMusicas = new ArrayList<>();
    }
    
    /* METODOS */
    public void reproduzirMusica(String musica) {
        System.out.println("Tocando agora: " + musica);
        sincronizarItunes();
    }

    public void interromperMusica() {
        System.out.println("Interrompendo música...");
        sincronizarItunes();
    }

    public void classificarMusica(String musica, int nota) {
        System.out.println("Musica " + musica + " classificada com nota " + nota);
        sincronizarItunes();
    }

    public void abrirReprodutorMusica() {
        System.out.println("Abrindo reprodutor de música");
        sincronizarItunes();
    }

    private void sincronizarItunes() {
        System.out.println("Sincronizando dados na nuvem iTunes...");
    }
}
