package modelo;

public class Piloto extends Funcionario {
    public Piloto(String nome, String cpf, int idade, String codigo){
        super(nome, cpf, idade, codigo);
        funcao = "Piloto";
        tipo = "Fun";
    }
}
