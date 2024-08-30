public class Iphone {

    public void ligar() {
        System.out.println("Ligando");
    }

    public void desligar() {
        System.out.println("Desligando");
    }

    public void bloquearTela() {
        System.out.println("Bloqueando");
    }

    public void desbloquearTela() {
        System.out.println("Desbloqueando");
    }

    public void conectarWiFi(String nomeRede) {
        System.out.println("Conectando na rede " + nomeRede);
    }

    public void desconectarWiFi() {
        System.out.println("Desconectando");
    }

    public void bloquearTela(int nivel) {
        System.out.println("Bloqueando na " + nivel);
    }

}
