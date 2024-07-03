public class Carro extends Terrestre {

    public Carro() {
    }

    public Carro(String motor) {
        super(motor);
    }

    public Carro(int portas) {
        super(portas);
    }


    public void seta() {
        System.out.println("Dando seta");
    }

    public void ligarFarol() {
        System.out.println("Farol ligado");
    }
}
