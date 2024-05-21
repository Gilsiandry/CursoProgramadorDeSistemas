import org.w3c.dom.ls.LSOutput;

public class Bolsas {
    public String marca;
    public String modelo;
    public String cor;
    public String tamanho;
    private boolean cheia;

    public Bolsas(String marca, String modelo, String cor, String tamanho) {
        setMarca(marca);
        setModelo(modelo);
        setCor(cor);
        setTamanho(tamanho);
        setCheia(false);

    }
    public void imprimir (){
        System.out.println("Minha mochila é da marca " + marca+ " e modelo " +modelo+ "e cor " + cor + " e tamanho " + tamanho);
    }

    public void adicionar (){
        if (cheia == false){
            //cheia = true;
            setCheia(true);
            System.out.println("Item foi adicionado à bolsa.");

        }else{
            System.out.println("Bolsa cheia. Novo item não pode ser adicionado.");
        }
    }

    private boolean bolsaNaCadeira = false;
    public void marcarAcento(){

        if (bolsaNaCadeira == false){
            bolsaNaCadeira = true;
            System.out.println("O Luiz está fora da sala.");

        }else{
            System.out.println("O Luiz está em sala.");
        }
    }

    //set = definir
    public void setMarca (String marca){
        this.marca = marca;

    }
    public String getMarca(){
        return this.marca;

    }

    public void setModelo (String modelo){
        this.modelo = modelo;

    }
    public String getModelo(){
        return this.modelo;
    }
    public void setCor (String cor){
        this.cor = cor;

    }
    public String getCor(){
        return this.cor;
    }

    public void setTamanho (String tamanho){
        this.tamanho = tamanho;

    }
    public String getTamanho(){
        return this.tamanho;
    }
    private void setCheia (boolean cheia){
        this.cheia = cheia;

    }
    public boolean getCheia(){
        return this.cheia;
    }

}
