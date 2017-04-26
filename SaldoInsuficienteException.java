package conta;

public class SaldoInsuficienteException extends Exception 
{

    public SaldoInsuficienteException() 
{
    super("Falta de saldo para esta operação");

}
    
    public SaldoInsuficienteException (String mensagem) 
    {
        super(mensagem);
    }
}
