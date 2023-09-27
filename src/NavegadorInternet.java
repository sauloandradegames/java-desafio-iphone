public class NavegadorInternet {
    /* ATRIBUTOS */
    private ClienteEmail clienteEmail;

    /* METODOS */
    private void exibirPagina() {
        System.out.println("Carregando página da Web...");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba ao navegador...");
        exibirPagina();
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    public void acessarGoogleMaps() {
        System.out.println("Acessando Google Maps...");
    }

    public void acessarWidgetClima() {
        System.out.println("Acessando widget de previsão do tempo...");
    }

    public void acessarWidgetNegocios() {
        System.out.println("Acessando widget de bolsa de valores...");
    }

    public void abrirEmail() {
        clienteEmail.carregarMensagem();
        clienteEmail.escreverMensagem();
        clienteEmail.enviarMensagem();
    }
}
