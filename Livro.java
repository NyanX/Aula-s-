package vendas;

public class Livro extends Produto implements Vendavel
{
 private String Autor;
 private String ISBN;
 
  public Livro (int Codigo, String Descricao, double Preco, String Autor, String ISBN)
 {
 super(Codigo, Descricao, Preco);
 this.Autor = Autor;
 this.ISBN = ISBN;
 }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    @Override
     public String getDescricaoCompleta()
     
     {
         return "Livro: " + super.getDescrição()+ "Autor: " + Autor + "ISBN: " + ISBN;
     }
     
     public double getValorVenda()
     {
         return getPreco() * 2.2; 
     }
 
}
