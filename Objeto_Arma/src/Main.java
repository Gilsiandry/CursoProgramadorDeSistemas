//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // arma1.setCalibre ("9mm");
        //arma1.setTipo ("pistola");
        //arma1.setDisparo("semiautomatica");
        //arma1.setCartucho(6);

        Arma arma1 = new Arma("9mm","pistola","semi-automatica",6);

        arma1.imprimir();

        arma1.atirar ();

    }
}