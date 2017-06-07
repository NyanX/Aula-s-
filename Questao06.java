package atividade;
import javax.swing.JOptionPane;
public class Questao06 {

	public static void main(String[] args) {
		
	
        String nome = JOptionPane.showInputDialog("DIGITE O SEU NOME: ");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("DIGITE SUA IDADE: "));

        
        	if (idade <= 10)
        {
        JOptionPane.showMessageDialog(null, "Nome: "+nome+"\nValor a pagar: R$ 160,00");
        }
        
        	else if (idade > 10 && idade <=29)
        {
        JOptionPane.showMessageDialog(null, "Nome: "+nome+"\nValor a pagar: R$ 180,00");
        }
        
        	else if (idade > 29 && idade <=45)
        {
        JOptionPane.showMessageDialog(null, "Nome: "+nome+"\nValor a pagar: R$ 220,00");
        }
        
        	else if (idade > 29 && idade <=45)
        {
        JOptionPane.showMessageDialog(null, "Nome: "+nome+"\nValor a pagar: R$ 220,00");
        }
        
        	else if (idade > 45 && idade <=59)
        {
        JOptionPane.showMessageDialog(null, "Nome: "+nome+"\nValor a pagar: R$ 380,00");
        }
        
        	else if (idade > 59 && idade <=65)
        {
        JOptionPane.showMessageDialog(null, "Nome: "+nome+"\nValor a pagar: R$ 450,00");
        }
        
        	else if (idade> 65)
        {
        JOptionPane.showMessageDialog(null, "Nome: "+nome+"\nValor a pagar: R$ 550,00");

        }
	}

}
