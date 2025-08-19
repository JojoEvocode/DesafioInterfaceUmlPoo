public class Iphone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico {

    String musica;
    String contato;
    String mensagem;
    String url;

    @Override
    public void ligar(String contato) {
        System.out.println("Realizando chamada para " + contato);
    }

    @Override
    public void atender(String contato) {
        System.out.println("Recebendo chamada de " + contato);
    }

    @Override
    public void iniciarCorreioVoz(String mensagem) {
        System.out.println("Deixando a mensagem: " + mensagem);
    }

    @Override
    public void tocar(String musica) {
        System.out.println("Reproduzindo " + musica);
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Escolha a música a ser tocada");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Acessando o site " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página sendo atualizada");
    }

}
