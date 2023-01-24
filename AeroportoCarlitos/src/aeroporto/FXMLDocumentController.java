/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package aeroporto;

import modelo.Aviao;
import modelo.Funcionario;
import modelo.Pessoa;
import modelo.DadosInexistenteException;
import modelo.Cargueiro;
import modelo.Voo;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;
import bancodados.BancoDeDados;
import bancodados.Compositor;


/**
 *
 * @author artse
 */
public class FXMLDocumentController implements Initializable {
    private Compositor compositor;
    private BancoDeDados banco;
    private String concatena;
    private Alert alert;
    private int var, dec;  
    
    @FXML
    private RadioButton radioAeromoca;

    @FXML
    private RadioButton radioCopiloto;
    
    @FXML
    private RadioButton radioPiloto;
    
    @FXML
    private RadioButton radioViajante;
    
    @FXML
    private RadioButton radioPassageiros;
    
    @FXML
    private RadioButton radioJatinho;
    
    @FXML
    private RadioButton radioCargueiro;
    
    @FXML
    private Button AdicionarAvi;

    @FXML
    private Button AdicionarVoo;

    @FXML
    private Button AdicionarPes;

    @FXML
    private TextField txtpes;
    
    @FXML
    private TextField txtavi;

    
    @FXML
    private ImageView image;
    
    @FXML
    private TextField txtvoo;

    @FXML
    private TextField avtxt3;

    @FXML
    private TextField avtxt4;

    @FXML
    private TextField avtxt5;

    @FXML
    private TextField avtxt6;

    @FXML
    private TextField avtxt1;

    @FXML
    private TextField avtxt2;

    @FXML
    private Button concluir;

    @FXML
    private Button concluir1;

    @FXML
    private Button concluir3;

    @FXML
    private Button pesquisarPes;
    
    @FXML
    private Button pesquisarAvi;
    
    @FXML
    private Button pesquisarVoo;

    @FXML
    private Button listaPes;
    
    @FXML
    private Button listaAvi;
    
    @FXML
    private Button listaVoo;

    @FXML
    private Label l;

    @FXML
    private Label l7;

    @FXML
    private Label l8;

    @FXML
    private Label lab1;

    @FXML
    private Label lab1avi;

    @FXML
    private Label lab1voo;

    @FXML
    private Label lab2;

    @FXML
    private Label lab2avi;

    @FXML
    private Label lab2voo;

    @FXML
    private Label lab3;

    @FXML
    private Label lab3avi;

    @FXML
    private Label lab3voo;

    @FXML
    private Label lab4;

    @FXML
    private Label lab4avi;

    @FXML
    private Label lab5;

    @FXML
    private Label lab6;

    @FXML
    private Label lab6avi;

    @FXML
    private Label lab5avi;

    @FXML
    private TextField txt1;

    @FXML
    private TextField vootxt1;

    @FXML
    private TextField txt2;

    @FXML
    private TextField vootxt2;

    @FXML
    private TextField txt3;

    @FXML
    private TextField vootxt3;

    @FXML
    private TextField txt4;

    @FXML
    private TextField txt5;

    @FXML
    private TextField txt6;

    @FXML
    private TextField txte;

    @FXML
    private TextField txte1;

    @FXML
    private TextField txte2;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        compositor  = new Compositor();
        banco = new BancoDeDados();
        concatena = "";
        var = 0;
        dec = 0;
        
        lab1.setAlignment(Pos.CENTER_RIGHT);
        lab2.setAlignment(Pos.CENTER_RIGHT);
        lab3.setAlignment(Pos.CENTER_RIGHT);
        lab4.setAlignment(Pos.CENTER_RIGHT);
        lab5.setAlignment(Pos.CENTER_RIGHT); 
        lab6.setAlignment(Pos.CENTER_RIGHT);

        lab1avi.setAlignment(Pos.CENTER_RIGHT);
        lab2avi.setAlignment(Pos.CENTER_RIGHT);
        lab3avi.setAlignment(Pos.CENTER_RIGHT);
        lab4avi.setAlignment(Pos.CENTER_RIGHT);
        lab5avi.setAlignment(Pos.CENTER_RIGHT); 
        lab6avi.setAlignment(Pos.CENTER_RIGHT);

        lab1voo.setAlignment(Pos.CENTER_RIGHT);
        lab2voo.setAlignment(Pos.CENTER_RIGHT);
        lab3voo.setAlignment(Pos.CENTER_RIGHT);

        alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Relatório");
    }

    private void exibeRelatorio(){
        TextArea area=new TextArea(concatena);
        area.setWrapText(true);
        area.setEditable(false);

        alert.getDialogPane().setContent(area);
        alert.setResizable(true);
        alert.showAndWait();
    }

    @FXML
    private void modificaVarEDec(ActionEvent e){
        if(e.getSource() == radioViajante){
            var = 4;
            txt6.setVisible(false);
            lab6.setVisible(false);
        }
        else{
            txt6.setVisible(true);
            lab6.setVisible(true);
            
            if(e.getSource() == radioPiloto){
                var = 1;
            }
            if(e.getSource() == radioCopiloto){
                var = 2;
            }
            if(e.getSource() == radioAeromoca){
                var = 3;
            }
        }

        if(e.getSource() == radioCargueiro){
            dec = 3;
            lab4avi.setVisible(true);
            avtxt4.setVisible(true);
            lab5avi.setVisible(true);
            avtxt5.setVisible(true);
        }
        else{
            lab4avi.setVisible(false);
            avtxt4.setVisible(false);
            lab5avi.setVisible(false);
            avtxt5.setVisible(false);

            if(e.getSource() == radioPassageiros){
                dec = 1;
            }
            if(e.getSource() == radioJatinho){
                dec = 2;
            }
        }
    }

    private void limpar(){
        txt1.setText("");
        txt2.setText("");
        txt3.setText("");
        txt5.setText("");
        txt6.setText("");
        avtxt1.setText("");
        avtxt2.setText("");
        avtxt4.setText("");
        avtxt5.setText("");
        avtxt6.setText("");
        vootxt1.setText("");
        vootxt2.setText("");
        vootxt3.setText("");
    }
        
          
    @FXML
    private void btnClick(ActionEvent e) throws IOException {
        //ADIÇÕES
        if(e.getSource() == AdicionarPes){
            try{
                String nome = txt1.getText();
                String cpf = txt2.getText();
                int idade = Integer.parseInt(txt3.getText());
                int numVoo = Integer.parseInt(txt5.getText());
                String codigo = txt6.getText();
                if(var!=0){
                    Pessoa p = compositor.criarPessoa(nome,cpf,idade,var,codigo);
                    if(banco.verificaPessoa(p)==true){
                        JOptionPane.showMessageDialog(null, "Essa pessoa já foi adicionada!", "Mensagem", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    banco.addPessoa(p);
                    try{
                        banco.pesquisaVooPorCodigo(numVoo).addPessoa(p);
                        limpar();
                        msg();
                    }
                    catch(DadosInexistenteException ex){
                        JOptionPane.showMessageDialog(null, "Esse voo não existe! Verifique o código", "Mensagem", JOptionPane.ERROR_MESSAGE);
                    }
                    return;
                }
                msgErro();
            }
            catch(NumberFormatException ex){
                msgErro();
            }
        }

        if(e.getSource() == AdicionarAvi){
            try{
                String nome = avtxt1.getText();
                String sit = avtxt2.getText();
                int capacidade = Integer.parseInt(avtxt6.getText());

                if (dec==1 || dec==2){
                    Aviao a = compositor.criarAviao(nome,sit,capacidade,dec);
                    if(banco.verificaAviao(a)==true){
                        JOptionPane.showMessageDialog(null, "Esse avião já foi adicionado!", "Mensagem", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    banco.addAviao(a);
                    limpar();
                    msg();
                    return;
                }
                if(dec==3){
                    String carga=avtxt5.getText();
                    int tara=Integer.parseInt(avtxt4.getText());
                    Aviao a = compositor.criarCargueiro(nome,sit,capacidade,dec,carga,tara);
                    if(banco.verificaAviao(a)==true){
                        JOptionPane.showMessageDialog(null, "Esse avião já foi adicionado!", "Mensagem", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    banco.addAviao(a);
                    limpar();
                    msg();
                    return;
                }
                msgErro();
            }
            catch(NumberFormatException ex){
                msgErro();
            }
        }

        if(e.getSource() == AdicionarVoo){
            try{
                int num = Integer.parseInt(vootxt1.getText());
                String nome = vootxt2.getText();                //nome do aviao
                String desc = vootxt3.getText();
                for(int i=0; i<banco.getVoos().size(); i++){
                    if(banco.getVoos().get(i).getCodigo() == num){
                        dec = 0;
                        var = 0;
                        JOptionPane.showMessageDialog(null, "Já existe um voo com esse código!", "Mensagem", JOptionPane.ERROR_MESSAGE);
                        return ;
                    }
                }
                try {
                    banco.addVoo(compositor.criarVoo(banco.pesquisaAviaoPorNome(nome),desc, num));
                    limpar();
                    msg();
                } catch (DadosInexistenteException e2) {
                    msgErro();
                }
            }
            catch(NumberFormatException ex){
                msgErro();
            }
        }   
            
        //PESQUISAS
        concatena = "";

        if(e.getSource() == listaPes){
            alert.setHeaderText("lista de Pessoas");

            for (Pessoa pe : banco.getPessoas()) {// TRIPULAÇÃO
                concatena+="\nNome: "+ pe.getNome()+"\nCPF: "+pe.getCPF()+"\nIdade: "+ pe.getIdade();
                if (pe.getTipo().equals("Fun")) {// SE FOR FUNCIONÁRIO
                    concatena+="\nFunção: "+((Funcionario) pe).getFuncao()+"\nCódigo: "+((Funcionario) pe).getCodigo()+"\n";
                }
                concatena+="\n---------------------------------------------";
            }

            exibeRelatorio();
        }

        if(e.getSource() == pesquisarPes){
            alert.setHeaderText("Pesquisa Pessoa");

            String mol=txtpes.getText();
            alert.setTitle("Pesquisa Pessoa");
            for (Voo vo : banco.getVoos()) {
                for (Pessoa p : vo.getGrupoPassageiros()){// DESCRIÇÃO DO VOO
                    if (p.getNome().equals(mol)){
                        concatena += "Voo: " + vo.getCodigo() + " - " + vo.getDescricao();
                        concatena += "\nAvião " + vo.getAviao().getModelo() + " - " + vo.getAviao().getSit() + " - " + vo.getAviao().getCapacidade() + " lugares";
                        if (vo.getAviao().getTipo() == 3)
                            concatena+="\nTara: "+((Cargueiro) vo.getAviao()).getTara()+" - Carga "+ ((Cargueiro) vo.getAviao()).getCarga();
                        concatena+="\n---------------------------------------------";
                    } 
                }
            }

            for(Pessoa p: banco.getPessoas()){ //DESCRIÇÃO PESSOA
                if(p.getNome().equals(mol)){
                    concatena+="\nNome: "+ p.getNome()+"\nCPF: "+p.getCPF()+"\nIdade: "+  p.getIdade();
                    if (p.getTipo().equals("Fun")) 
                        concatena+="\nFunção: "+((Funcionario) p).getFuncao()+"\nCódigo: "+((Funcionario) p).getCodigo();
                }
            }
            
            exibeRelatorio();
        }

        if(e.getSource() == listaAvi){
            alert.setHeaderText("lista de Aviões");

            for (Aviao a: banco.getAvioes()) {// DESCRIÇÃO DO VOO
                concatena += "\nAvião " + a.getModelo() + " - " + a.getSit() + " - " + a.getCapacidade() + " lugares";
                if (a.getTipo() == 3)
                    concatena += "\nTara: "+((Cargueiro) a).getTara()+" - Carga "+ ((Cargueiro) a).getCarga();
                concatena+="\n---------------------------------------------";
            }

            exibeRelatorio();
        }

        if(e.getSource() == pesquisarAvi){
            alert.setHeaderText("Pesquisa Avião");

            String mol=txtavi.getText();
            for (Voo vo : banco.getVoos()) {
                if (vo.getAviao().getModelo().equals(mol)) {// DESCRIÇÃO DO VOO
                    concatena+="Voo: " + vo.getCodigo() + " - " + vo.getDescricao();
                }
            }
            for(Aviao av: banco.getAvioes()){
                if (av.getModelo().equals(mol)) {
                    concatena+="\nAvião " + av.getModelo() + " - " + av.getSit() + " - " + av.getCapacidade() + " lugares";
                    if (av.getTipo() == 3)
                        concatena+="\nTara: "+((Cargueiro) av).getTara()+" - Carga "+ ((Cargueiro) av).getCarga();
                    concatena+="\n---------------------------------------------";
                }
            }
            
            exibeRelatorio();
        }

        if(e.getSource() == listaVoo){
            alert.setHeaderText("lista de Voos");

            for (Voo vo : banco.getVoos()) {// DESCRIÇÃO DO VOO
                concatena+="\nVoo: " + vo.getCodigo() + " - " + vo.getDescricao();
                concatena+="\n-----------------------------------";  
            }
             
            exibeRelatorio();
        }
        
        if(e.getSource() == pesquisarVoo){
            alert.setHeaderText("Pesquisa Voo");

            int mol = Integer.parseInt(txtvoo.getText());
            for (Voo vo : banco.getVoos()) {
                if (vo.getCodigo() == mol) { // DESCRIÇÃO DO VOO
                    concatena += "Voo: " + vo.getCodigo() + " - " + vo.getDescricao();
                    //descricao(vo.getAviao());
                }
            }

            exibeRelatorio();
        }   

        dec=0;
        var=0;

    }
        
    public void msg(){
        JOptionPane.showMessageDialog(null, "Adicionado com Sucesso!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
    }
    public void msgErro(){
        JOptionPane.showMessageDialog(null, "Erro ao adicionar, verifique os campos!", "Mensagem", JOptionPane.ERROR_MESSAGE);
    }
    
}
