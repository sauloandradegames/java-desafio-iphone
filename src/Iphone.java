public class Iphone {
    /* ATRIBUTOS */
    private NavegadorInternet navegadorInternet;
    private Telefone telefone;
    private ReprodutorMusica reprodutorMusica;

    /* CONSTRUTOR */
    public Iphone() {
        this.navegadorInternet = new NavegadorInternet();
        this.telefone = new Telefone();
        this.reprodutorMusica = new ReprodutorMusica();
    }
    
    /* METODOS */
    public void abrirNavegadorInternet() {
        System.out.println("Abrindo Safari...");
        navegadorInternet.adicionarNovaAba();
    }
    

    public void abrirTelefone() {
        System.out.println("Iniciando telefone");
        telefone.abrirAgenda();
    }

    public void abrirReprodutorMusica() {
        System.out.println("Abrindo reprodutor de músicas");
        reprodutorMusica.abrirReprodutorMusica();
    }

    /* EXECUTANDO */
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("Bem vindo ao iPhone!");
        iphone.abrirNavegadorInternet();
        iphone.abrirReprodutorMusica();
        iphone.abrirTelefone();
    }
}
