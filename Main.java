package conta;

import javax.swing.JOptionPane;

public class Main 
{
    public static void main(String[] args)
    {
        Conta c1 = new Conta();
        try 
        {
            c1.credito(100);
            c1.debito(50);
            c1.debito(500);
        }
        
        catch (SaldoInsuficienteException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
         catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
        finally
        {
            JOptionPane.showMessageDialog(null, c1.getSaldo());
        }
    }
}
