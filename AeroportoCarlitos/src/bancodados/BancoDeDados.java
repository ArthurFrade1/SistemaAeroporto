/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancodados;

import modelo.DadosInexistenteException;
import modelo.Aviao;
import modelo.Pessoa;
import modelo.Voo;
import modelo.*;

import java.util.ArrayList;

/**
 *
 * @author artse
 */
public class BancoDeDados {
    private ArrayList<Pessoa> pessoas;
    private ArrayList<Aviao> avioes;
    private ArrayList<Voo> voos;
    private Aviao av1, av2, av3, av4, av5;
    private Voo voo1, voo2, voo3, voo4, voo5;

    public void preencher(){
        av1=new Passageiros("sus", "Voando", 50);
        av2=new Passageiros("Avião do Forró", "Parado", 45);
        av3=new Passageiros("boing", "Voando", 60);
        av4=new Passageiros("tre", "Voando", 40);
        av5=new Jatinho("jat", "Parado", 6);
        avioes.add(av1);
        avioes.add(av2);
        avioes.add(av3);
        avioes.add(av4);
        avioes.add(av5);

        
        
        
        // CRIANDO VOOS
        voo1=new Voo(av1, "Luxemburgo - Paris | 19h00-21h00", 976);
        voo2=new Voo(av2, "Kyoto - Tokio | 02h20--02h50", 453);
        voo3=new Voo(av3, "Santa Catarina - Cidade do Méxixo | 23h00-00h00", 111);
        voo4=new Voo(av4, "Berlim - Lisboa | 17h20--02h50", 001);
        voo5=new Voo(av5, "Moçambique - Buenos Aires", 888);
        voos.add(voo1);
        voos.add(voo2);
        voos.add(voo3);
        voos.add(voo4);
        voos.add(voo5);

        // CRIANDO PESSOAS
        
        voo1.addPessoa(new Piloto("Jonas", "4736432-34", 43, "M3NG43"));
        voo1.addPessoa(new Copiloto("Andres", "1234567-34", 63, "DHJ34HH"));
        voo1.addPessoa(new Aeromoça("Vanessa", "58498843-34", 20, "CP0075"));
        voo1.addPessoa(new Aeromoça("Matilda", "59382102-43", 20, "CCS074"));
    
        voo1.addPessoa(new Viajante("Louro Jose", "456546546-43", 93));
        voo1.addPessoa(new Viajante("Jair Bolsonaro", "123127312-23", 13));
        voo1.addPessoa(new Viajante("Neymar", "232323454-34", 23));
        voo1.addPessoa(new Viajante("Kuririn", "556453434-45", 34));
        voo1.addPessoa(new Viajante("Juninho Portugal", "656445343-23", 54));
        voo1.addPessoa(new Viajante("Chimbinha", "423123123-35", 65));
        voo1.addPessoa(new Viajante("Itadori", "366756745-35", 75));
        voo1.addPessoa(new Viajante("Vin Diesel", "242324445-45", 73));
        voo1.addPessoa(new Viajante("Ayrton Senna", "756556353-43", 52));
        voo1.addPessoa(new Viajante("Dom Pedro", "352231313-56", 31));
        voo1.addPessoa(new Viajante("Xuxa", "343546451-56", 74));
        voo1.addPessoa(new Viajante("Fatima Bernardes", "132133424-35", 53));
        voo1.addPessoa(new Viajante("Chaves", "142343534-43", 84));
        voo1.addPessoa(new Viajante("Van Dijk", "453231432-67", 40));
        voo1.addPessoa(new Viajante("Kakashi", "574633076-43", 06));
        voo1.addPessoa(new Viajante("Light Yagami", "377383930-78", 91));
        voo1.addPessoa(new Viajante("Donald Trump", "373521363-98", 76));
        voo1.addPessoa(new Viajante("Gusttavo Lima", "068562629-43", 62));

            
    
    
        voo2.addPessoa(new Piloto("Joelton", "201281734-98", 90, "JASBDIS"));
        voo2.addPessoa(new Copiloto("Giuliano", "432324455-32", 10, "DAS7DAS"));
        voo2.addPessoa(new Aeromoça("Marilurdes", "048372038-43", 30, "DT8ASDA"));
        voo2.addPessoa(new Aeromoça("Creuza", "048372038-43", 30, "DT8ASDA"));
        voo2.addPessoa(new Aeromoça("Francisca", "342423424-43", 30, "DSF4SDF"));
        voo2.addPessoa(new Aeromoça("Mercedes", "244543224-43", 30, "F8ASD9F"));
        voo2.addPessoa(new Aeromoça("Rivalda", "403827407-43", 30, "FG4T43"));
        
        voo2.addPessoa(new Viajante("Pablo Emilio Escobar", "019163963-32", 50));
        voo2.addPessoa(new Viajante("Reginaldo Rossi", "019163963-32", 12));
        voo2.addPessoa(new Viajante("Oscar Niemeyer", "019163963-32", 33));
        voo2.addPessoa(new Viajante("Juscelino Kubitschek", "019163963-32", 54));
        voo2.addPessoa(new Viajante("Brian O'Conner", "019163963-32", 98));
    
    
    
    
        voo3.addPessoa(new Piloto("Emiliano", "332249274-34", 43, "MDASH7"));
        voo3.addPessoa(new Copiloto("Gilmar", "3434341212-13", 64, "JASDJAD"));
        voo3.addPessoa(new Aeromoça("Madonna", "947183957-07", 34, "AS78DY"));
        voo3.addPessoa(new Aeromoça("Lucia", "936458715-28", 11, "23E83ED"));
    
        voo3.addPessoa(new Viajante("Luis", "456546546-43", 93));
        voo3.addPessoa(new Viajante("Yujiro", "372638742-32", 43));
        voo3.addPessoa(new Viajante("Tanjiro", "329328844-43", 12));
        voo3.addPessoa(new Viajante("Sergio", "344534353-65", 10));
        voo3.addPessoa(new Viajante("Girafales", "123987345-76", 16));
        voo3.addPessoa(new Viajante("Clotilde", "495718023-34", 50));
        voo3.addPessoa(new Viajante("Serafim", "495718423-62", 56));
        voo3.addPessoa(new Viajante("Maria Joaquina", "495184023-73", 13));
        voo3.addPessoa(new Viajante("Crefisa", "495718403-57", 7));
        voo3.addPessoa(new Viajante("Simba", "482019482-46", 70));
        voo3.addPessoa(new Viajante("Naruto", "104958371-35", 67));
        voo3.addPessoa(new Viajante("Ramon", "204938174-34", 53));
        voo3.addPessoa(new Viajante("Kirk Hammett", "948275018-63", 85));
        voo3.addPessoa(new Viajante("Dio Brando", "194728502-42", 216));
    
    
    
    
        voo4.addPessoa(new Piloto("Americo", "332249274-34", 43, "MDASH7"));
        voo4.addPessoa(new Copiloto("Maycon", "049271947-34", 63, "DASDA4"));
        voo4.addPessoa(new Aeromoça("Anelia", "346663284-90", 45, "CP9OO6"));
        voo4.addPessoa(new Aeromoça("Simone", "9378619278-43", 20, "AS6D57A"));
    
        voo4.addPessoa(new Viajante("Pedro", "938948938-93", 43));
        voo4.addPessoa(new Viajante("Ana", "492857109-93", 13));
        voo4.addPessoa(new Viajante("Beatriz", "258671234-93", 64));
        voo4.addPessoa(new Viajante("Joana", "123567452-93", 35));
        voo4.addPessoa(new Viajante("Maria", "876544344-93", 97));
        voo4.addPessoa(new Viajante("Manuela", "876543356-93", 73));
        voo4.addPessoa(new Viajante("Rhianna", "958372058-93", 15));
        voo4.addPessoa(new Viajante("Elizabeth", "059381740-93", 28));
        voo4.addPessoa(new Viajante("Dilma Rousseff", "059381749-93", 63));
        voo4.addPessoa(new Viajante("Maria Antonieta", "058927505-93", 76));
        voo4.addPessoa(new Viajante("Clarice Lispector", "058473208-93", 87));
        voo4.addPessoa(new Viajante("Joana Dark", "059481740-93", 70));
        voo4.addPessoa(new Viajante("Mia", "403482334-93", 53));
        voo4.addPessoa(new Viajante("Fiona", "059488272-93", 03));
        voo4.addPessoa(new Viajante("Zuleica", "178181656-93", 01));
        
    
    
    
        voo5.addPessoa(new Piloto("Chico", "309173947-34", 64, "DNASNDA"));
        voo5.addPessoa(new Copiloto("Maycon", "049271947-34", 54, "DASIDHASD"));
        voo5.addPessoa(new Aeromoça("Anelia", "346663284-90", 89, "ASKIDHAS"));
        voo5.addPessoa(new Aeromoça("Simone", "9378619278-43", 8, "SGDA8D"));
    
        voo5.addPessoa(new Viajante("Carlao", "234234234-32", 23));
        voo5.addPessoa(new Viajante("Sukuna", "432444234-32", 10));
        voo5.addPessoa(new Viajante("Carminha", "121234434-32", 42));
        voo5.addPessoa(new Viajante("Cristiano Ronaldo", "644342312-32", 54));
        voo5.addPessoa(new Viajante("Vladmir Putin", "456543635-32", 65));
        voo5.addPessoa(new Viajante("Wilian Bonner", "474234141-32", 76));
        voo5.addPessoa(new Viajante("Satoro Gojo", "127618341-32", 34));
        voo5.addPessoa(new Viajante("Saitama", "121762712-32", 87));
        voo5.addPessoa(new Viajante("Paulo Plinio", "217212121-32", 32));
        voo5.addPessoa(new Viajante("Roberto Carlos", "347836473-32", 85));
        voo5.addPessoa(new Viajante("Fiuk", "816271221-32", 52));
        voo5.addPessoa(new Viajante("Juliette", "627156251-32", 17));
        voo5.addPessoa(new Viajante("Bruno", "261526121-32", 15));
        voo5.addPessoa(new Viajante("Nazaré", "324273712-32", 31));
    

    
       

        //
        pessoas.add(new Piloto("Jonas", "4736432-34", 43, "M3NG43"));
        pessoas.add(new Copiloto("Andres", "1234567-34", 63, "DHJ34HH"));
        pessoas.add(new Aeromoça("Vanessa", "58498843-34", 20, "CP0075"));
        pessoas.add(new Aeromoça("Matilda", "59382102-43", 20, "CCS074"));
    
        pessoas.add(new Viajante("Louro Jose", "456546546-43", 93));
        pessoas.add(new Viajante("Jair Bolsonaro", "123127312-23", 13));
        pessoas.add(new Viajante("Neymar", "232323454-34", 23));
        pessoas.add(new Viajante("Kuririn", "556453434-45", 34));
        pessoas.add(new Viajante("Juninho Portugal", "656445343-23", 54));
        pessoas.add(new Viajante("Chimbinha", "423123123-35", 65));
        pessoas.add(new Viajante("Itadori", "366756745-35", 75));
        pessoas.add(new Viajante("Vin Diesel", "242324445-45", 73));
        pessoas.add(new Viajante("Ayrton Senna", "756556353-43", 52));
        pessoas.add(new Viajante("Dom Pedro", "352231313-56", 31));
        pessoas.add(new Viajante("Xuxa", "343546451-56", 74));
        pessoas.add(new Viajante("Fatima Bernardes", "132133424-35", 53));
        pessoas.add(new Viajante("Chaves", "142343534-43", 84));
        pessoas.add(new Viajante("Van Dijk", "453231432-67", 40));
        pessoas.add(new Viajante("Kakashi", "574633076-43", 06));
        pessoas.add(new Viajante("Light Yagami", "377383930-78", 91));
        pessoas.add(new Viajante("Donald Trump", "373521363-98", 76));
        pessoas.add(new Viajante("Gusttavo Lima", "068562629-43", 62));

            
    
    
        pessoas.add(new Piloto("Joelton", "201281734-98", 90, "JASBDIS"));
        pessoas.add(new Copiloto("Giuliano", "432324455-32", 10, "DAS7DAS"));
        pessoas.add(new Aeromoça("Marilurdes", "048372038-43", 30, "DT8ASDA"));
        pessoas.add(new Aeromoça("Creuza", "048372038-43", 30, "DT8ASDA"));
        pessoas.add(new Aeromoça("Francisca", "342423424-43", 30, "DSF4SDF"));
        pessoas.add(new Aeromoça("Mercedes", "244543224-43", 30, "F8ASD9F"));
        pessoas.add(new Aeromoça("Rivalda", "403827407-43", 30, "FG4T43"));
        
        pessoas.add(new Viajante("Pablo Emilio Escobar", "019163963-32", 50));
        pessoas.add(new Viajante("Reginaldo Rossi", "019163963-32", 12));
        pessoas.add(new Viajante("Oscar Niemeyer", "019163963-32", 33));
        pessoas.add(new Viajante("Juscelino Kubitschek", "019163963-32", 54));
        pessoas.add(new Viajante("Brian O'Conner", "019163963-32", 98));
    
    
    
    
        pessoas.add(new Piloto("Emiliano", "332249274-34", 43, "MDASH7"));
        pessoas.add(new Copiloto("Gilmar", "3434341212-13", 64, "JASDJAD"));
        pessoas.add(new Aeromoça("Madonna", "947183957-07", 34, "AS78DY"));
        pessoas.add(new Aeromoça("Lucia", "936458715-28", 11, "23E83ED"));
    
        pessoas.add(new Viajante("Luis", "456546546-43", 93));
        pessoas.add(new Viajante("Yujiro", "372638742-32", 43));
        pessoas.add(new Viajante("Tanjiro", "329328844-43", 12));
        pessoas.add(new Viajante("Sergio", "344534353-65", 10));
        pessoas.add(new Viajante("Girafales", "123987345-76", 16));
        pessoas.add(new Viajante("Clotilde", "495718023-34", 50));
        pessoas.add(new Viajante("Serafim", "495718423-62", 56));
        pessoas.add(new Viajante("Maria Joaquina", "495184023-73", 13));
        pessoas.add(new Viajante("Crefisa", "495718403-57", 7));
        pessoas.add(new Viajante("Simba", "482019482-46", 70));
        pessoas.add(new Viajante("Naruto", "104958371-35", 67));
        pessoas.add(new Viajante("Ramon", "204938174-34", 53));
        pessoas.add(new Viajante("Kirk Hammett", "948275018-63", 85));
        pessoas.add(new Viajante("Dio Brando", "194728502-42", 216));
    
    
    
    
        pessoas.add(new Piloto("Americo", "332249274-34", 43, "MDASH7"));
        pessoas.add(new Copiloto("Maycon", "049271947-34", 63, "DASDA4"));
        pessoas.add(new Aeromoça("Anelia", "346663284-90", 45, "CP9OO6"));
        pessoas.add(new Aeromoça("Simone", "9378619278-43", 20, "AS6D57A"));
    
        pessoas.add(new Viajante("Pedro", "938948938-93", 43));
        pessoas.add(new Viajante("Ana", "492857109-93", 13));
        pessoas.add(new Viajante("Beatriz", "258671234-93", 64));
        pessoas.add(new Viajante("Joana", "123567452-93", 35));
        pessoas.add(new Viajante("Maria", "876544344-93", 97));
        pessoas.add(new Viajante("Manuela", "876543356-93", 73));
        pessoas.add(new Viajante("Rhianna", "958372058-93", 15));
        pessoas.add(new Viajante("Elizabeth", "059381740-93", 28));
        pessoas.add(new Viajante("Dilma Rousseff", "059381749-93", 63));
        pessoas.add(new Viajante("Maria Antonieta", "058927505-93", 76));
        pessoas.add(new Viajante("Clarice Lispector", "058473208-93", 87));
        pessoas.add(new Viajante("Joana Dark", "059481740-93", 70));
        pessoas.add(new Viajante("Mia", "403482334-93", 53));
        pessoas.add(new Viajante("Fiona", "059488272-93", 03));
        pessoas.add(new Viajante("Zuleica", "178181656-93", 01));
        
    
    
    
        pessoas.add(new Piloto("Chico", "309173947-34", 64, "DNASNDA"));
        pessoas.add(new Copiloto("Maycon", "049271947-34", 54, "DASIDHASD"));
        pessoas.add(new Aeromoça("Anelia", "346663284-90", 89, "ASKIDHAS"));
        pessoas.add(new Aeromoça("Simone", "9378619278-43", 8, "SGDA8D"));
    
        pessoas.add(new Viajante("Carlao", "234234234-32", 23));
        pessoas.add(new Viajante("Sukuna", "432444234-32", 10));
        pessoas.add(new Viajante("Carminha", "121234434-32", 42));
        pessoas.add(new Viajante("Cristiano Ronaldo", "644342312-32", 54));
        pessoas.add(new Viajante("Vladmir Putin", "456543635-32", 65));
        pessoas.add(new Viajante("Wilian Bonner", "474234141-32", 76));
        pessoas.add(new Viajante("Satoro Gojo", "127618341-32", 34));
        pessoas.add(new Viajante("Saitama", "121762712-32", 87));
        pessoas.add(new Viajante("Paulo Plinio", "217212121-32", 32));
        pessoas.add(new Viajante("Roberto Carlos", "347836473-32", 85));
        pessoas.add(new Viajante("Fiuk", "816271221-32", 52));
        pessoas.add(new Viajante("Juliette", "627156251-32", 17));
        pessoas.add(new Viajante("Bruno", "261526121-32", 15));
        pessoas.add(new Viajante("Nazaré", "324273712-32", 31));
    

    }

    //construtor
    public BancoDeDados(){
        pessoas = new ArrayList<>();
        avioes = new ArrayList<>();
        voos = new ArrayList<>();
        preencher();
    }

    //gets 
    public ArrayList<Aviao> getAvioes() {
        return avioes;
    }
    public ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }
    public ArrayList<Voo> getVoos() {
        return voos;
    }

    //sets
    public void setAvioes(ArrayList<Aviao> avioes) {
        this.avioes = avioes;
    }
    public void setPessoas(ArrayList<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }
    public void setVoos(ArrayList<Voo> voos) {
        this.voos = voos;
    }

    //metodos de adicionar

    public void addPessoa(Pessoa p){
        if(!verificaPessoa(p)){
            pessoas.add(p);
        }
    }

    public void addAviao(Aviao a){
        if(!verificaAviao(a)){
            avioes.add(a);
        }
    }
    
    public void addVoo(Voo v){
        if(verificaVoos(v)==false){
            voos.add(v);
        }
    }
    
    //metodos de pesquisar

    public Pessoa pesquisaPessoaPorNome(String nome) throws DadosInexistenteException{
        for(int i=0;i<pessoas.size();i++){
            if(pessoas.get(i).getNome().equals(nome)){
                return pessoas.get(i);
            }
        }
        throw new DadosInexistenteException();
    }

    public Aviao pesquisaAviaoPorNome(String nome) throws DadosInexistenteException{
        for(int i=0;i<avioes.size();i++){
            if(avioes.get(i).getModelo().equals(nome)){
                return avioes.get(i);
            }
        }
        throw new DadosInexistenteException();
    }

    public Voo pesquisaVooPorCodigo(int numero) throws DadosInexistenteException{
        for(int i=0;i<voos.size();i++){
            if(voos.get(i).getCodigo()==(numero)){
                return voos.get(i);
            }
        }
        throw new DadosInexistenteException();
    }

    //funcoes de verificar, evita adicionar coisas repetidas

    public boolean verificaPessoa(Pessoa p) {
        for(int i=0;i<pessoas.size();i++){
            if(pessoas.get(i) != null && pessoas.get(i).getNome().equals(p.getNome())){
                return true;
            }
        }
        return false;
    }

    public boolean verificaAviao(Aviao a) {
        for(int i=0;i<avioes.size();i++){
            if(avioes.get(i) != null && avioes.get(i).getModelo().equals(a.getModelo())){
                return true;
            }
        }
        return false;
    }

    public boolean verificaVoos(Voo v) {
        for(int i=0;i<voos.size();i++){
            if(voos.get(i) != null && voos.get(i).getCodigo() == v.getCodigo()){
                return true;
            }
        }
        return false;
    }

}

