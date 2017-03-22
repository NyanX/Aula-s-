package biblioteca;
import java.util.Scanner;

public class Main {
        
    public static void main (String[] args) 
    {
     
  //O Scanner serve para o usuário inserir um certo dado.
        Scanner scan = new Scanner(System.in);
  System.out.println("Digite o nome do Livro:");
          String temp = scan.nextLine();
           
//O sistema solicita a informação e o próprio usuário insere.
          System.out.println("Digite o nome do Autor:");
          String tempa = scan.nextLine();
          
          System.out.println("Digite o nome do Genero:");
         String tempb = scan.nextLine();
          
          System.out.println("Digite o nome do Editora:");
          String tempc = scan.nextLine();
          
          // Sendo assim a classe e seus atributos serão preenchidos pelo próprio usuário.
          Livro a = new Livro();
          a.setNome(temp);
          a.setAutor(tempa);
           a.setGenero(tempb);
            a.setEditora(tempc);
            
            System.out.println(temp + " " +  tempa+ " " + tempb + " " + tempc);
          
          
          
          
  
 
   }
}
