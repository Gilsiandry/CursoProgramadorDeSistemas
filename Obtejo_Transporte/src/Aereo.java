public class Aereo extends Transporte {


    public double alturaMaxima;

    public Aereo(double alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }

    public String getAlturaMaxima() {
        return alturaMaxima;
    }

    public void setAlturaMaxima(double alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }

    @Override
    public void ligar() {


    }

    @Override
    public void emitirSom() {
        System.out.println("Som de áereo");

    }

    public void decolar() {
        System.out.println("Decolando");
    }
    public void pousar() {
        System.out.println("Em solo");
    }
}
