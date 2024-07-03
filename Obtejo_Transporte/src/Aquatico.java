public class Aquatico extends Transporte {

    public double capacidadePeso;

    public Aquatico(double capacidadePeso) {
            this.capacidadePeso = capacidadePeso;
    }

    public double getCapacidadePeso() {
        return capacidadePeso;
    }

    public void setCapacidadePeso(double capacidadePeso) {
        this.capacidadePeso = capacidadePeso;
    }


    @Override
    public void ligar() {

    }

    @Override
    public void emitirSom() {
        System.out.println("Som de aquatico");

    }

    public void acelerar() {
        System.out.println("Acelerando");
    }
}
