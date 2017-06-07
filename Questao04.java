package atividade;
import javax.swing.JOptionPane;
public class Questao04 {

	public static void main(String[] args) {
        int candidato1 = 0, candidato2 = 0, candidato3 = 0;
        
        String municipio = JOptionPane.showInputDialog("Digite o nome do município: \n\n");
        int qtd = Integer.parseInt(JOptionPane.showInputDialog("INSIRA A QUANTIDADE DE ELEITORES"));
  
        for(int i = 1 ; i<=qtd ; i++){
        int voto = Integer.parseInt(JOptionPane.showInputDialog("EM QUEM VOCÊ IRÁ VOTAR? \n CANDIDATO 1 \n CANDIDATO 2 \n CANDIDATO 3"));
        
        if (voto == 1){
            candidato1 = candidato1+1;
        }
        else if (voto == 2){
            candidato2 = candidato2+1;
        }
        else if (voto == 3){
            candidato3 = candidato3+1;
        }
        
       }
        
        if((candidato1 == candidato2 || candidato2 == candidato3 ||  candidato1 == candidato3) && qtd >=20000){
         JOptionPane.showMessageDialog(null, municipio+"\nEMPATE, TERÁ SEGUNDO TURNO\n\nResultado: \nCANDIDATO 1:   "+candidato1+"\nCANDIDATO 2:   "+candidato2+"\nCANDIDATO 3:   "+candidato3);
         
        }
        else
        JOptionPane.showMessageDialog(null, municipio+"\n\n RESULTADO2: \nCANDIDATO 1:   "+candidato1+"\nCANDIDATO 2:   "+candidato2+"\nCANDIDATO 3:   "+candidato3);


	}

}
