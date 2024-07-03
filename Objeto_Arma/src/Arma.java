public class Arma {
    public String calibre;
    public String tipo;
    public String disparo;
    public int cartucho;
    protected boolean travada;

    public Arma(String calibre, String tipo, String disparo, int cartucho) {
        setCalibre(calibre);
        setTipo(tipo);
        setDisparo(disparo);
        setCartucho(cartucho);
        setTravada(false);
    }

    public void imprimir() {
        System.out.println("A arma é do calibre " + calibre + " e tipo " + tipo + " e disparo " + disparo + " e cartucho " + cartucho);
    }

    public void atirar() {
        if (travada == false) {
            setTravada(true);
            System.out.println("Arma disparou.");

        } else {
            System.out.println("Arma Travada. Disparo não pode ser realizado.");
        }
    }


    //set = definir
    public void setCalibre(String calibre) {
        this.calibre = calibre;

    }

    public String getCalibre() {
        return this.calibre;

    }

    public void setTipo(String tipo) {
        this.tipo = tipo;

    }

    public String getTipo() {
        return this.tipo;
    }

    public void setDisparo(String disparo) {
        this.disparo = disparo;

    }

    public String getDisparo() {

        return this.disparo;
    }

    public void setCartucho(int cartucho) {
        this.cartucho = cartucho;

    }

    public int getCartucho() {

        return this.cartucho;
    }

    protected void setTravada(boolean travada) {
        this.travada = travada;

    }

    protected boolean getTravada() {
        return this.travada;
    }
}