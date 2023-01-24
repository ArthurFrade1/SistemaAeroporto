package modelo;

public class Passageiros extends Aviao{
    public Passageiros(String modelo, String sit, int capacidade){
        super(modelo, sit, capacidade);
        tipo = 1;
    }
}
