package modelo;

public class Copiloto extends Funcionario {
    public Copiloto(String nome, String cpf, int idade, String codigo){
        super(nome, cpf, idade, codigo);
        funcao = "Copiloto";
        tipo = "Fun";
    }
}
