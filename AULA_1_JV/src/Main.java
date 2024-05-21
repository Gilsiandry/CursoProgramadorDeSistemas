//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //bolsa1.marca = "dell";
        //bolsa1.setMarca ("dell");
        //bolsa1.modelo = "mochila";
        //bolsa1.setModelo("mochila");
        //bolsa1.cor = "preta";
        //bolsa1.setCor("preta");
        //bolsa1.tamanho = "grande";
        //bolsa1.setTamanho("tamanho");

        Bolsas bolsa1 = new Bolsas("dell", "mochila", "preta", "grande");
        Bolsas bolsa2 = new Bolsas("made in china", "necessarie", "prata", "pequena");
        Bolsas bolsa3 = new Bolsas("senac", "ecobag", "branca", "média");

        bolsa1.imprimir();
        bolsa2.imprimir();
        bolsa3.imprimir();

        System.out.println(bolsa1.getMarca());

    System.out.println("A bolsa é do modelo " +bolsa1.modelo+ " marca " +bolsa1.marca+ " cor " +bolsa1.cor+ " e tamanho " +bolsa1.tamanho);

    bolsa1.adicionar ();
    bolsa1.marcarAcento();
        }
    }