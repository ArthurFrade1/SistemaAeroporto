
package modelo;

public class DadosInexistenteException extends Exception{
    public DadosInexistenteException(){
        super("Verifique se os campos foram preenchidos corretamente!");
    }
}
