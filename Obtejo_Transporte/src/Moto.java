public class Moto extends Terrestre{
    public Moto() {
        System.out.println("Moto");
    }

    public Moto(String marca) {
        super(marca);
    }

    public Moto(int ano) {
        super(ano);
    }
    public Moto(int cilindrada) {
        super(cilindrada);
    }


    public void seta() {
        System.out.println("Dando seta");
    }

    public void ligarFarol() {
        System.out.println("Farol ligado");
    }
    public void grau() {
        System.out.println("Sem grau irmão");
    }
}
