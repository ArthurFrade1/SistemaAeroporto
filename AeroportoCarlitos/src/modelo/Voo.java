
package modelo;

import java.util.ArrayList;

public class Voo {
    protected Aviao aviao;
    protected String descricao;
    protected int codigo;
    protected ArrayList<Pessoa> grupoPassageiros;

    //construtor
    public Voo(Aviao aviao, String descricao, int codigo){
        this.aviao = aviao;
        this.descricao = descricao;
        this.codigo = codigo;
        grupoPassageiros = new ArrayList<>();
    }

    //get
    public Aviao getAviao() {
        return aviao;
    }
    public String getDescricao() {
        return descricao;
    }
    public int getCodigo() {
        return codigo;
    }
    public ArrayList<Pessoa> getGrupoPassageiros() {
        return grupoPassageiros;
    }

    //set
    public void setAviao(Aviao aviao) {
        this.aviao = aviao;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setGrupoPassageiros(ArrayList<Pessoa> grupoPassageiros) {
        this.grupoPassageiros = grupoPassageiros;
    }

    //metodos do arraylist

    public void addPessoa(Pessoa p){
        if(!verifica(p.nome)){
            grupoPassageiros.add(p);
        }
    }

    public Pessoa pesquisaPessoaPorNome(String nome) throws DadosInexistenteException{
        for(int i=0;i<grupoPassageiros.size();i++){
            if(grupoPassageiros.get(i).getNome().equals(nome)){
                return grupoPassageiros.get(i);
            }
        }
        throw new DadosInexistenteException();
    }

    public boolean verifica(String nome) {
        for(int i=0;i<grupoPassageiros.size();i++){
            if(grupoPassageiros.get(i).getNome().equals(nome)){
                return true;
            }
        }
        return false;
    }
    
}