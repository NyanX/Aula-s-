package atividade;

import javax.swing.JOptionPane;

public class Questao {

	   public static void main(String[] args) { 
		   
		   String produto = JOptionPane.showInputDialog("Digite O nome do Produto: ");
		   
	        double valor =  Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do produto: "));   
	        
	        JOptionPane.showMessageDialog(null,"Produto:  "+ produto+"\nValor:  "+valor+" R$");

	        }
	   }
