
package conta;

public class Conta {
    
    private double saldo;

    public void debito(double valor)throws SaldoInsuficienteException
    {
        if(valor < 0)
            throw new IllegalArgumentException("Valor deve ser maior que zero");
        
        else if(saldo - valor < 0)
            throw new SaldoInsuficienteException("Saldo atual é insuficiente" + saldo);
            
        saldo -= valor;
    }
    
    public void credito(double valor)
    {
        if(valor < 0)
            throw new IllegalArgumentException("Valor deve ser maior que zero");
        
        else if(saldo - valor < 0)
            saldo += valor;
    }
    
    public double getSaldo() {
        return saldo;
    }
}
