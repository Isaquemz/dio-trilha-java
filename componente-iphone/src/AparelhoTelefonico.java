
public class AparelhoTelefonico extends Iphone {

    public void fazerLigacao(String numeroTelefone) {
        System.out.println("Ligando para " + numeroTelefone);
    }

    public void receberLigacao(String idChamada) {
        System.out.println("Recebendo ligação de " + idChamada);
    }

    public void enviarSMS(String mensagem, String numeroTelefone) {
        System.out.println("Enviando SMS para " + numeroTelefone);
    }

}
