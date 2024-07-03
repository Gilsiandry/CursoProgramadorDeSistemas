public class Peixe extends Animal {
    public String corEscama;

    public Peixe(String corEscama) {
        this.corEscama = corEscama;
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Substâncias aquáticas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Peixe");
    }
    public void soltarBolha() {
        System.out.println("Glu Glu Glu");
    }
}
