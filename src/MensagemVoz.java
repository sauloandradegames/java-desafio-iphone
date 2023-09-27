public class MensagemVoz {
    /* ATRIBUTOS */
    private String destinatario;
    private int mensagemAudio;

    /* CONSTRUTOR */
    public MensagemVoz(String destinatario, int mensagemAudio) {
        this.destinatario = destinatario;
        this.mensagemAudio = mensagemAudio;
    }

    /* GETTERS */
    public String getDestinatario() {
        return destinatario;
    }

    public int getMensagemAudio() {
        return mensagemAudio;
    }
}
