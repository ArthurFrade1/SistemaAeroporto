/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancodados;

import modelo.Aviao;
import modelo.Pessoa;
import modelo.Piloto;
import modelo.Viajante;
import modelo.Aeromoça;
import modelo.Cargueiro;
import modelo.Copiloto;
import modelo.Jatinho;
import modelo.Passageiros;
import modelo.Voo;

/**
 *
 * @author artse
 */
public class Compositor {

    //construtor
    public Compositor(){
    }
    
    //metodos de compor
    public Pessoa criarPessoa(String nome, String cpf, int idade, int tipo, String codigo) {
        Pessoa p;
        if(tipo == 1){
            p = new Piloto(nome, cpf, idade, codigo);
            return p;
        }
        else if(tipo == 2){
            p = new Copiloto(nome, cpf, idade, codigo);
            return p;
        }
        else if(tipo == 3){
            p = new Aeromoça(nome, cpf, idade, codigo);
            return p;
        }
        else{
            p = new Viajante(nome, cpf, idade);
            return p;
        }
    }
    
    public Aviao criarAviao(String modelo, String sit, int capacidade, int tipo) {
        Aviao av;
        if(tipo==1){
            av = new Passageiros(modelo, sit, capacidade);
            return av;
        }
        else {
            av = new Jatinho(modelo, sit, capacidade);
            return av;
        }
    }
    
     public Aviao criarCargueiro(String modelo, String sit, int capacidade, int tipo,String carga, int tara) {
        Aviao av = new Cargueiro(modelo, sit, capacidade, tara,carga);
        return av;
    }
    
    public Voo criarVoo(Aviao aviao, String descricao, int codigo){
        Voo voo = new Voo(aviao,descricao,codigo);
        return voo;
    }
    
}
