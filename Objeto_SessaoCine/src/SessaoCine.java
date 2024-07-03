public class SessaoCine {
    public String filme;
    public String genero;
    public String assento;
    public int classificacao;
    public String horario;
    protected boolean meiaEntrada;
    public boolean pipoca;

    public SessaoCine(String filme, String genero, String assento, int classificacao, String horario) {
        setFilme(filme);
        setGenero(genero);
        setAssento(assento);
        setClassificacao(classificacao);
        setHorario(horario);
        setMeiaEntrada(false);
    }

    public void imprimir() {
        System.out.println("Detalhes da sua compra: O filme é " + filme + ", genero " + genero + ", assento " + assento + ", classificação " + classificacao + ", horário " + horario);
    }

    public void comprar() {
        if (meiaEntrada == false) {
            setMeiaEntrada(true);
            System.out.println("Meia entrada aprovada.");

        } else {
            System.out.println("Erro. Não é possivel comprar uma meia entrada!.");
        }
    }

    public void assistir() {
        System.out.println("Você está assistindo o filme " + filme);
    }

    public void comer() {
        if (pipoca == true) {
            System.out.println("Comendo pipoca.");

        } else {
            System.out.println("você não tem pipoca para comer.");
        }
    }


    //set = definir
    public void setFilme(String filme) {
        this.filme = filme;

    }

    public String getFilme() {
        return this.filme;

    }

    public void setGenero(String genero) {
        this.genero = genero;

    }

    public String getGenero() {
        return this.genero;
    }

    public void setAssento(String assento) {
        this.assento = assento;

    }

    public String getAssento() {

        return this.assento;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;

    }

    public int getClassificacao() {

        return this.classificacao;
    }

    public void setHorario(String horario) {
        this.horario = horario;

    }

    public String getHorario() {

        return this.horario;
    }

    protected void setMeiaEntrada(boolean meiaEntrada) {
        this.meiaEntrada = meiaEntrada;

    }

    protected boolean getMeiaEntrada() {
        return this.meiaEntrada;
    }



        protected void setPipoca ( boolean pipoca){
            this.pipoca = pipoca;
        }

        protected boolean getPipoca () {
            return this.pipoca;
        }
    }