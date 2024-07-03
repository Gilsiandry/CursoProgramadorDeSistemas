//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // sessaoCine1.setFilme ("Up - Altas Aventuras");
        //sessaoCine1.setGenero ("animação");
        //sessaoCine1.setAssento("G8");
        //sessaoCine1.setClassificacao(16);
        //sessaoCine1.setHorario("18:00");

        SessaoCine sessaoCine1 = new SessaoCine("Up - Altas Aventuras","animação","G8",16, "18:00");

        sessaoCine1.imprimir();

        sessaoCine1.comprar ();

        sessaoCine1.assistir();

        sessaoCine1.comer();
    }
}