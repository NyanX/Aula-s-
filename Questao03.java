package atividade;
import javax.swing.JOptionPane;
public class Questao03 {

	public static void main(String[] args) {
		String destino = "";
        double valor = 0, iv;
        
        
        int OP1 = Integer.parseInt(JOptionPane.showInputDialog("INSIRA O DESTINO: \n1- Regi�o Norte R$500 \n2- Regi�o Nordeste R$350 \n3- Regi�o Ceontro-Oeste R$400 \n4- Regi�o Sul R$300\n\n"));
        switch (OP1){
            case 1:
                
                iv = Integer.parseInt(JOptionPane.showInputDialog("DESEJA IDA E VOLTA ?\n 1 - Sim       2 - N�o"));
                if (iv == 1)
                {
                destino = "Ida e volta para Regi�o Norte";
                valor = 900;
                }
                else if(iv == 2){
                destino = "S� de ida para Regi�o Norte";
                valor = 500;
                }
                break;
                
            case 2: 
                
                iv = Integer.parseInt(JOptionPane.showInputDialog("DESEJA IDA E VOLTA ?\n 1 - Sim       2 - N�o"));
                if (iv == 1)
                {
                destino = "Ida e volta para Regi�o Nordeste";
                valor = 750;
                }
                else if(iv == 2){
                destino = "S� de ida para Regi�o Nordeste";
                valor = 350;
                }
                break;
                
            case 3: 
                
                iv = Integer.parseInt(JOptionPane.showInputDialog("DESEJA IDA E VOLTA ?\n 1 - Sim       2 - N�o"));
                if (iv == 1)
                {
                destino = "Ida e volta para Regi�o Centro-Oeste";
                valor = 750;
                }
                else if(iv == 2){
                destino = "S� de ida para Regi�o Centro-Oeste";
                valor = 400;
                }
                break;
                
            case 4:
               
                iv = Integer.parseInt(JOptionPane.showInputDialog("DESEJA IDA E VOLTA ?\n 1 - Sim       2 - N�o"));
                if (iv == 1)
                {
                destino = "Ida e volta para Regi�o Sul";  
                valor = 550;
                }
                else if(iv == 2){
                destino = "S� de ida para Regi�o Sul";    
                valor = 300;
                break;
                }
                
                }
  
                JOptionPane.showMessageDialog(null, destino +"\nvalor: R$"+valor);


	}

}
