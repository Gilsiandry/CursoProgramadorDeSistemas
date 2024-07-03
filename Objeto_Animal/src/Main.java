//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Mamifero m = new Mamifero("Marrom");
        //Reptil r = new Reptil("Verde");
        //Peixe p = new Peixe("Cinza");
        //Ave a = new Ave("Branca");

        Canguru c = new Canguru("Marrom");
        Cachorro k = new Cachorro("Branco");
        Tartaruga t = new Tartaruga("");
        PeixeDourado p = new PeixeDourado("Laranja");
        Arara a = new Arara("Azul");

        k.setPeso(40.5);
        k.setMembros(4);
        k.emitirSom();
        k.locomover();


        System.out.println(m.getCorPelo());
        m.locomover();
        m.alimentar();
        m.emitirSom();

        System.out.println(r.getCorEscama());
        r.locomover();
        r.alimentar();
        r.emitirSom();
    }
}