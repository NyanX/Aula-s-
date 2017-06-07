package atividade;
import javax.swing.JOptionPane;
public class Questao07 {

	public static void main(String[] args) {
		
        String nome = JOptionPane.showInputDialog("INSIRA O NOME DO PRODUTO: ");
        double valor = Integer.parseInt(JOptionPane.showInputDialog("INSIRA O VALOR DE COMPRA: "));
        
        if (valor >= 20){
        valor = valor * 1.45;
        }
        
        else{
         valor = valor * 1.30;   
        }
        
        JOptionPane.showMessageDialog(null, "Produto: "+nome+"\nValor:  R$ "+valor);         

        
	}

}
