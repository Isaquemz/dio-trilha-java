public class NavegadorInternet extends Iphone {

    public void abrirPaginaWeb(String url) {
        System.out.println("Abrindo pagina: " + url);
    }

    public void atualizarPagina() {
        System.out.println("Atualizando pagina.");
    }

    public void adicionarFavorito(String url) {
        System.out.println("Adicionando pagina ao favorito: " + url);
    }

}
