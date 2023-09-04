import aplicativos.Aplicativo;

public class Iphone extends AparelhoTelefonico implements Aplicativo {

    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();

        reprodutorMusical.selecionarMusica();
        reprodutorMusical.tocar();
        reprodutorMusical.pausar();

        navegadorNaInternet.exibirPagina();
        navegadorNaInternet.adicionarNovaAba();
        navegadorNaInternet.atualizarPagina();
    }
}
