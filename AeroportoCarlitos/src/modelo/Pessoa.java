package modelo;

public abstract class Pessoa{
    protected String nome;
    protected String cpf;
    protected int idade;
    protected String tipo;

    //Construtor
    public Pessoa(String nome, String cpf, int idade){
        this.cpf = cpf;
        this.idade = idade;
        this.nome = nome;
    }

    //gets
    public String getCPF() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }
    
    public String getTipo() {
        return tipo;
    }

    //sets
    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}