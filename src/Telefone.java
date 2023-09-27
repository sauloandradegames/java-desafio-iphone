public class Telefone {
    /* ATRIBUTOS */
    private AgendaTelefone agenda;
    private CorreioVoz correioVoz;

    /* CONSTRUTOR */
    public Telefone() {
        this.agenda = new AgendaTelefone();
    }

    /* METODOS */
    public void iniciarLigacao(int telefone) {
        System.out.println("Ligando para " + telefone + " ...");
    }

    public void atenderLigacao() {
        System.out.println("Ligação atendida!");
    }

    public void rejeitarLigacao() {
        System.out.println("Ligação rejeitada!");
    }

    public void encerrarLigacao() {
        System.out.println("Ligação encerrada");
    }

    public void colocarChamadaEspera() {
        System.out.println("Colocando chamada em espera...");
    }

    public void habilitarVivaVoz() {
        System.out.println("Viva-voz ativado");
    }

    public void desabilitarVivaVoz() {
        System.out.println("Viva-voz desabilitado");
    }

    public void iniciarConferencia() {
        System.out.println("Iniciando chamada em conferencia");
    }

    public void abrirAgenda() {
        System.out.println("Abrindo agenda...");
        agenda.abrirAgenda();
    }

    public void abrirCorreioVoz() {
        System.out.println("Abrindo correio de voz...");
        correioVoz.listarMensagemVoz();
    }


}
