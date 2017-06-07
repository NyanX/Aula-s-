package atividade;
import javax.swing.JOptionPane;
public class Questao02 {

	public static void main(String[] args) {
        double caloriaP = 0,caloriaS = 0, caloriaB = 0;
        String prato = "", SMesa = "",bebida = "";
        
        int OP1 = Integer.parseInt(JOptionPane.showInputDialog("ESCOLHA UM PRATO: \n\n"+"1 - Carne\n2 - Frango\n"));
        switch (OP1)
        {
   
            case 1:
                prato = "Carne";
                caloriaP = 200;
                break;
            case 2:
                prato = "Frango";
                caloriaP = 300;
                break;
        }
 
        int OP2 = Integer.parseInt(JOptionPane.showInputDialog("ESCOLHA UMA SOBREMESA: \n\n"+"1 - Sorvete \n2 - Pudim\n"));
        switch (OP2)
        {
            case 1:
                SMesa = "Sorvete";
                caloriaS = 100;
                break;
            case 2:
                SMesa = "Pudim";
                caloriaS = 200;
                break;
        }
        
        int OP3 = Integer.parseInt(JOptionPane.showInputDialog("ESCOLHA UM PRATO: \n\n"+"1 - Refrigerante \n2 - Café\n"));
        switch (OP3)
        {
            case 1:
                bebida = "Refrigerante";
                caloriaB = 90;
                break;
            case 2:
                bebida = "Café";
                caloriaB = 20;
                break;
        }
        JOptionPane.showMessageDialog(null,"Prato:   "+prato+"\nSobremesa:   "+SMesa+"\nBebida: "+bebida+"\n\nTotal Caloria:   "+(caloriaP+caloriaS+caloriaB)+"Cal");


	}

}
