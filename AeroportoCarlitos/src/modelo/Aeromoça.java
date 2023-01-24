package modelo;

public class Aeromoça extends Funcionario {
    public Aeromoça(String nome, String cpf, int idade, String codigo){
        super(nome, cpf, idade, codigo);
        funcao = "Aeromoça";
        tipo = "Fun";
    }
}
