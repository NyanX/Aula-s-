package atividade;
import javax.swing.JOptionPane;
public class Questao03 {

	public static void main(String[] args) {
		String destino = "";
        double valor = 0, iv;
        
        
        int OP1 = Integer.parseInt(JOptionPane.showInputDialog("INSIRA O DESTINO: \n1- Região Norte R$500 \n2- Região Nordeste R$350 \n3- Região Ceontro-Oeste R$400 \n4- Região Sul R$300\n\n"));
        switch (OP1){
            case 1:
                
                iv = Integer.parseInt(JOptionPane.showInputDialog("DESEJA IDA E VOLTA ?\n 1 - Sim       2 - Não"));
                if (iv == 1)
                {
                destino = "Ida e volta para Região Norte";
                valor = 900;
                }
                else if(iv == 2){
                destino = "Só de ida para Região Norte";
                valor = 500;
                }
                break;
                
            case 2: 
                
                iv = Integer.parseInt(JOptionPane.showInputDialog("DESEJA IDA E VOLTA ?\n 1 - Sim       2 - Não"));
                if (iv == 1)
                {
                destino = "Ida e volta para Região Nordeste";
                valor = 750;
                }
                else if(iv == 2){
                destino = "Só de ida para Região Nordeste";
                valor = 350;
                }
                break;
                
            case 3: 
                
                iv = Integer.parseInt(JOptionPane.showInputDialog("DESEJA IDA E VOLTA ?\n 1 - Sim       2 - Não"));
                if (iv == 1)
                {
                destino = "Ida e volta para Região Centro-Oeste";
                valor = 750;
                }
                else if(iv == 2){
                destino = "Só de ida para Região Centro-Oeste";
                valor = 400;
                }
                break;
                
            case 4:
               
                iv = Integer.parseInt(JOptionPane.showInputDialog("DESEJA IDA E VOLTA ?\n 1 - Sim       2 - Não"));
                if (iv == 1)
                {
                destino = "Ida e volta para Região Sul";  
                valor = 550;
                }
                else if(iv == 2){
                destino = "Só de ida para Região Sul";    
                valor = 300;
                break;
                }
                
                }
  
                JOptionPane.showMessageDialog(null, destino +"\nvalor: R$"+valor);


	}

}
