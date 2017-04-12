
package main;
import javax.swing.JOptionPane;
public class IARP {
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    private String [] msg = {"Alicota de 7.5%" ," Alicota de 15% ", "Alicota de 22.5%" ,"Alicota de 27.5%" };
    
            public void validar(){
            if (salario >= 1903.99 && salario <= 2826.65)
           JOptionPane.showMessageDialog(null, msg[0]);
            
            
            else if (salario >= 2826.66 && salario <= 3751.05)
           JOptionPane.showMessageDialog(null, msg[1]);
            
            
            else if (salario >= 3751.06 && salario <= 4664.68)
           JOptionPane.showMessageDialog(null, msg[2]);
            
            else if (salario >  4664.68)
           JOptionPane.showMessageDialog(null, msg[3]);
            
           JOptionPane.showMessageDialog(null, "Você Esta livre dos impostos");
    }       
}
