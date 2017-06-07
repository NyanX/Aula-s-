package atividade;
import javax.swing.JOptionPane;
public class Questao10 {

	public static void main(String[] args) {
		String indiceP = "", indiceP2 = "", indiceP3 = "";
		String industria = "", industria2 = "", industria3 = "";
		
		 int OP1 = Integer.parseInt(JOptionPane.showInputDialog("QUAL É O NÍVEL DE POLUIÇÃO DA USINA 01?: \n\n"+"1 - PRIMÁRIO\n2 - MÉDIO\n3 - CRÍTICO"));
	        switch (OP1)
	        {
	   
	            case 1:
	                industria = "PRIMÁRIO";
	                indiceP = "0.1 ~ 0.2";
	                break;
	            case 2:
	            	industria = "MÉDIO";
	                indiceP = "0.2 ~ 0.25" ;
	                break;
	            case 3:
	            	industria = "CRÍTICO";
	                indiceP = "0.3 ~ 0.5" ;
	                break;
	        }
	        
	     int OP2 = Integer.parseInt(JOptionPane.showInputDialog("QUAL É O NÍVEL DE POLUIÇÃO DA USINA 02?: \n\n"+"1 - PRIMÁRIO\n2 - MÉDIO\n3 - CRÍTICO"));
	        switch (OP2)
	        {
	   
	            case 1:
	                industria2 = "PRIMÁRIO";
	                indiceP2 = "0.1 ~ 0.2";
	                break;
	            case 2:
	            	industria2 = "MÉDIO";
	                indiceP2 = "0.2 ~ 0.25";
	                break;
	            case 3:
	            	industria2 = "CRÍTICO";
	                indiceP2 ="0.3 ~ 0.5";
	                break;
	        }

	     int OP3 = Integer.parseInt(JOptionPane.showInputDialog("QUAL É O NÍVEL DE POLUIÇÃO DA USINA 03?: \n\n"+"1 - PRIMÁRIO\n2 - MÉDIO\n3 - CRÍTICO"));
	        switch (OP3)
	        {
	   
	            case 1:
	                industria3 = "PRIMÁRIO";
	                indiceP3 = "0.1 ~ 0.2";
	                break;
	            case 2:
	            	industria3 = "MÉDIO";
	                indiceP3 = "0.2 ~ 0.25";
	                break;
	            case 3:
	            	industria3 = "CRÍTICO";
	                indiceP3 = "0.3 ~ 0.5";
	                break;
	        }
	        
	        JOptionPane.showMessageDialog(null, "INDÍCES DE POLUIÇÃO: \n" + "USINA 01:  " + industria + " " + indiceP + " \n USINA 02:  " + industria2 + " " + indiceP2 + " \n USINA 03:  " + industria3 + " " + indiceP3);
		
	        	if (OP1 == 2)
	        {
	        	JOptionPane.showMessageDialog(null, "Mensagem para USINA 01: \n" + "Seu indíce de poluição está no limite, advertemos que tome cuidado!");
	        }
	        
	        	if (OP2 == 2)
	        {
	        	JOptionPane.showMessageDialog(null, "Mensagem para USINA 02: \n" + "Seu indíce de poluição está no limite, advertemos que tome cuidado!");
	        }
	        
	        	if (OP3 == 2)
	        {
	        	JOptionPane.showMessageDialog(null, "Mensagem para USINA 03: \n" + "Seu indíce de poluição está no limite, advertemos que tome cuidado!");
	        }
	        	
	        		if (OP1 == 3)
		        {
		        	JOptionPane.showMessageDialog(null, "Mensagem para USINA 01: \n" +  "Pedimos para que reconsidere seu modo de produção, seu índice de poluição está transgredindo uma política estabelecida!");
		        }
	        	
	        		if (OP2 == 3)
		        {
		        	JOptionPane.showMessageDialog(null, "Mensagem para USINA 02: \n" +  "Pedimos para que reconsidere seu modo de produção, seu índice de poluição está transgredindo uma política estabelecida!");
		        }
	        	
	        		if (OP3 == 3)
		        {
		        	JOptionPane.showMessageDialog(null, "Mensagem para USINA 03: \n" +  "Pedimos para que reconsidere seu modo de produção, seu índice de poluição está transgredindo uma política estabelecida!");
		        }
	}

}
