package modelo;

public class Cargueiro  extends Aviao {
    protected String carga;
    protected int tara;
   
   //construtor
    public Cargueiro(String modelo, String sit, int capacidade, int tara, String carga){
        super(modelo, sit, capacidade);
        tipo = 3;
        this.tara = tara;
        this.carga = carga;
    }

    //get
    public String getCarga() {
        return carga;
    }
    public int getTara() {
        return tara;
    }

    //set
    public void setCarga(String carga) {
        this.carga = carga;
    }
    public void setTara(int tara) {
        this.tara = tara;
    }

}

