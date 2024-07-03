public class Terrestre extends Transporte{
    public Terrestre() {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
    }

    public String marca;

    public Terrestre(String marca) {
        this.marca = marca;
    }
    public String modelo;

    public Terrestre(String modelo) {
        this.modelo = modelo;
    }
    public int ano;
    public Terrestre (int ano) {
        this.ano = ano;
    }
    public String placa;
    public Terrestre (String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }


    public void ligar() {

    }
    public void emitirSom() {
        System.out.println("Som de terrestre");

    }
    public void acelerar() {
        System.out.println("Acelerando");
    }
    public void frear() {
        System.out.println("Freando");
    }
}
