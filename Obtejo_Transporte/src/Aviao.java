public class Aviao extends Aereo{
    public Aviao(double alturaMaxima) {
        super(alturaMaxima);
    }

    public Aviao(String tipo) {
        super(tipo);
    }
    public void taxiar() {
        System.out.println("Taxiando");
    }
    public void tremPouso() {
        System.out.println("Ativado");
    }
    public void serviçoBordo() {
        System.out.println("Servido");

    }
}
