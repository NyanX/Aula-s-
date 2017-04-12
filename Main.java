
package main;

import javax.swing.JOptionPane;
public class Main {

    public static void main(String[] args) {
        String tmp1, tmp2;
        int qtd;
        double valor;
        tmp1 = JOptionPane.showInputDialog(null, "Digite a quantidade de Pessoas ");
        qtd = Integer.parseInt(tmp1);
        
        Pessoa[] p = new Pessoa[qtd];
        for (int i = 0; i < qtd; i++)
        {
            
            
        tmp1 = JOptionPane.showInputDialog(null, "Digite o salario da pessoa "+ (i + 1));
        tmp2 = JOptionPane.showInputDialog(null, "Digite o seu Nome"+ (i + 1));
        valor = Double.parseDouble(tmp1);
        p[i] = new Pessoa (valor);
        p[i].setNome(tmp2);
        
        
        }
    }
    
}
