public class Armazenamento extends Iphone {

    public void salvarDados(String nomeDados, String dados) {
        System.out.println("Salvando: " + nomeDados);
    }

    public void recuperarDados(String nomeDados) {
        System.out.println("Retornando: " + nomeDados);
    }

    public void excluirDados(String nomeDados) {
        System.out.println("Deletando: " + nomeDados);
    }

}
