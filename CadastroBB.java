package livro;

import java.util.Arrays;

import java.util.Scanner;

public class Main {
        
    public static void main (String[] args) 
    {
     
  //O Scanner serve para o usuário inserir um certo dado.
        Scanner scan = new Scanner(System.in);
        System.out.println("Bem vindo ao cadastro de livros da biblioteca virtual!");
        System.out.println("Insira as informações do primeiro livro:");
  
        //O sistema solicita a informação e o próprio usuário insere.
        System.out.println("Digite o nome do Livro:");
          String temp = scan.nextLine();

          System.out.println("Digite o nome do Autor:");
          String tempa = scan.nextLine();
          
          System.out.println("Digite o nome do Genero:");
         String tempb = scan.nextLine();
          
          System.out.println("Digite o nome do Editora:");
          String tempc = scan.nextLine();
        
          Livro a = new Livro();
          a.setNome(temp);
          a.setAutor(tempa);
           a.setGenero(tempb);
            a.setEditora(tempc);
            ////////////////////////////
            System.out.println("Insira as informações do segundo livro:");
            
         System.out.println("Digite o nome do Livro:");
          String a1 = scan.nextLine();

          System.out.println("Digite o nome do Autor:");
          String a2= scan.nextLine();
          
          System.out.println("Digite o nome do Genero:");
         String a3 = scan.nextLine();
          
          System.out.println("Digite o nome do Editora:");
          String a4 = scan.nextLine();
        
          Livro b = new Livro();
          a.setNome(a1);
          a.setAutor(a2);
           a.setGenero(a3);
            a.setEditora(a4);
          //////////////////////////////
          System.out.println("Insira as informações do terceiro livro:");
          
             System.out.println("Digite o nome do Livro:");
          String b1 = scan.nextLine();

          System.out.println("Digite o nome do Autor:");
          String b2= scan.nextLine();
          
          System.out.println("Digite o nome do Genero:");
         String b3 = scan.nextLine();
          
          System.out.println("Digite o nome do Editora:");
          String b4 = scan.nextLine();
        
          Livro c = new Livro();
          a.setNome(b1);
          a.setAutor(b2);
           a.setGenero(b3);
            a.setEditora(b4);
            
           Livro[] quantidade = new Livro[3];
            
            quantidade[0] = a;
            quantidade[1] = b;
            quantidade[2] = c;
            
            System.out.println(Arrays.toString(quantidade));
            
   
            
            
    }
    
}
