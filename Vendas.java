package vendas;
import javax.swing.JOptionPane;

public class Vendas {

 
    public static void main(String[] args) 
    {
        CD cd1 = new CD(1, "Musica 1", 25.0, "João", "MK");
        JOptionPane.showMessageDialog(null, cd1.getPreco());
        Livro l1 = new Livro(2, "Reggae", 50, "Bob", "Maconha");
        JOptionPane.showMessageDialog(null, l1.getPreco());
        
    }
    
}
