
package biblioteca;

public class Main {
    
    public static void main (String[] args) 
    {
        //Objeto
    Livro a = new Livro();
    //Atributos, o "set" aplica um conteúdo gerando um atributo e o "get" chama esse nome.
    System.out.println("Livro(s) Disponível(s):");
    a.setNome ("Java");
    System.out.println("Título:" + a.getNome());
    a.setAutor("Luan");
    System.out.println("Autor:" + a.getAutor());
    a.setGenero("Informática");
    System.out.println("Gênero:" + a.getGenero());
    a.setEditora("Nebulosa");
    System.out.println("Editora:" + a.getEditora());
 
   }
}
