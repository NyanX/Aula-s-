package atividade;
import javax.swing.JOptionPane;
public class Questao08 {

	public static void main(String[] args) {
		 int sexo = Integer.parseInt(JOptionPane.showInputDialog("Informe seu sexo: \n\n1 - Homem \n2 - Mulher"));
         double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura: "));
         double peso = 0;
         
         switch (sexo){
             case 1:
                 peso = (72.7*altura) - 58;
                 break;
             case 2:
                 peso = (62.1*altura) - 44.7;
                 break;
         }
         JOptionPane.showMessageDialog(null, "Seu peso ideial é:  "+peso); 

	}

}
