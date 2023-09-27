import java.util.List;

public class CorreioVoz {
    /* ATRIBUTOS */
    private List<MensagemVoz> listaMensagemVoz;

    /* METODOS */
    public void reproduzirMensagemVoz(MensagemVoz mensagem) {
        carregarMensagemVoz(mensagem);
        System.out.println("Reproduzindo mensagem de voz...");
    }

    public void listarMensagemVoz() {
        System.out.println("Listando mensagens de voz...");
    }

    private void carregarMensagemVoz(MensagemVoz mensagem) {
        System.out.println("Carregando mensagem de voz...");
    }
}
