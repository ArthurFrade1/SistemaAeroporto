package modelo;

public abstract class Aviao {
    protected String modelo;
    protected String sit;   //situação
    protected int capacidade;
    protected int tipo;
    //protected ArrayList<Pessoa> povo= new ArrayList<>();

    //construtor
    public Aviao(String modelo, String sit, int capacidade){
        this.modelo = modelo;
        this.sit = sit;
        this.capacidade = capacidade;
    }

    //get
    public int getCapacidade() {
        return capacidade;
    }
    public String getModelo() {
        return modelo;
    }
    public String getSit() {
        return sit;
    }
    public int getTipo() {
        return tipo;
    }

    //set
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setSit(String sit) {
        this.sit = sit;
    }
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
}
