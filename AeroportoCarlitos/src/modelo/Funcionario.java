package modelo;

public abstract class Funcionario extends Pessoa{
    protected String funcao;
    protected String codigo;

    //construtor
    public void adicionarFun(String codigo){
        this.codigo = codigo;
    }
    public Funcionario(String nome, String cpf, int idade, String codigo){
        super(nome, cpf, idade);
        this.codigo = codigo;
    }

    //get
    public String getFuncao() {
        return funcao;
    }
    public String getCodigo() {
        return codigo;
    }

    //set
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

}
