package atividade;
import javax.swing.JOptionPane;
public class Questao10 {

	public static void main(String[] args) {
		String indiceP = "", indiceP2 = "", indiceP3 = "";
		String industria = "", industria2 = "", industria3 = "";
		
		 int OP1 = Integer.parseInt(JOptionPane.showInputDialog("QUAL � O N�VEL DE POLUI��O DA USINA 01?: \n\n"+"1 - PRIM�RIO\n2 - M�DIO\n3 - CR�TICO"));
	        switch (OP1)
	        {
	   
	            case 1:
	                industria = "PRIM�RIO";
	                indiceP = "0.1 ~ 0.2";
	                break;
	            case 2:
	            	industria = "M�DIO";
	                indiceP = "0.2 ~ 0.25" ;
	                break;
	            case 3:
	            	industria = "CR�TICO";
	                indiceP = "0.3 ~ 0.5" ;
	                break;
	        }
	        
	     int OP2 = Integer.parseInt(JOptionPane.showInputDialog("QUAL � O N�VEL DE POLUI��O DA USINA 02?: \n\n"+"1 - PRIM�RIO\n2 - M�DIO\n3 - CR�TICO"));
	        switch (OP2)
	        {
	   
	            case 1:
	                industria2 = "PRIM�RIO";
	                indiceP2 = "0.1 ~ 0.2";
	                break;
	            case 2:
	            	industria2 = "M�DIO";
	                indiceP2 = "0.2 ~ 0.25";
	                break;
	            case 3:
	            	industria2 = "CR�TICO";
	                indiceP2 ="0.3 ~ 0.5";
	                break;
	        }

	     int OP3 = Integer.parseInt(JOptionPane.showInputDialog("QUAL � O N�VEL DE POLUI��O DA USINA 03?: \n\n"+"1 - PRIM�RIO\n2 - M�DIO\n3 - CR�TICO"));
	        switch (OP3)
	        {
	   
	            case 1:
	                industria3 = "PRIM�RIO";
	                indiceP3 = "0.1 ~ 0.2";
	                break;
	            case 2:
	            	industria3 = "M�DIO";
	                indiceP3 = "0.2 ~ 0.25";
	                break;
	            case 3:
	            	industria3 = "CR�TICO";
	                indiceP3 = "0.3 ~ 0.5";
	                break;
	        }
	        
	        JOptionPane.showMessageDialog(null, "IND�CES DE POLUI��O: \n" + "USINA 01:  " + industria + " " + indiceP + " \n USINA 02:  " + industria2 + " " + indiceP2 + " \n USINA 03:  " + industria3 + " " + indiceP3);
		
	        	if (OP1 == 2)
	        {
	        	JOptionPane.showMessageDialog(null, "Mensagem para USINA 01: \n" + "Seu ind�ce de polui��o est� no limite, advertemos que tome cuidado!");
	        }
	        
	        	if (OP2 == 2)
	        {
	        	JOptionPane.showMessageDialog(null, "Mensagem para USINA 02: \n" + "Seu ind�ce de polui��o est� no limite, advertemos que tome cuidado!");
	        }
	        
	        	if (OP3 == 2)
	        {
	        	JOptionPane.showMessageDialog(null, "Mensagem para USINA 03: \n" + "Seu ind�ce de polui��o est� no limite, advertemos que tome cuidado!");
	        }
	        	
	        		if (OP1 == 3)
		        {
		        	JOptionPane.showMessageDialog(null, "Mensagem para USINA 01: \n" +  "Pedimos para que reconsidere seu modo de produ��o, seu �ndice de polui��o est� transgredindo uma pol�tica estabelecida!");
		        }
	        	
	        		if (OP2 == 3)
		        {
		        	JOptionPane.showMessageDialog(null, "Mensagem para USINA 02: \n" +  "Pedimos para que reconsidere seu modo de produ��o, seu �ndice de polui��o est� transgredindo uma pol�tica estabelecida!");
		        }
	        	
	        		if (OP3 == 3)
		        {
		        	JOptionPane.showMessageDialog(null, "Mensagem para USINA 03: \n" +  "Pedimos para que reconsidere seu modo de produ��o, seu �ndice de polui��o est� transgredindo uma pol�tica estabelecida!");
		        }
	}

}
