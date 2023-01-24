package modelo;

public class Viajante extends Pessoa{
    public Viajante(String nome, String cpf, int idade){
        super(nome, cpf, idade);
        tipo = "Pes";
    }
    
}
