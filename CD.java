package vendas;


public class CD extends Produto implements Vendavel
{
    private String Artista;
    private String Gravadora;
    
    public CD(int Codigo, String Descricao, double Preco, String Artista, String Gravadora)
    {
    super(Codigo, Descricao, Preco);
    this.Artista = Artista;
    this.Gravadora = Gravadora ; 
    }
    
    public String getArtista() {
        return Artista;
    }

    public void setArtista(String Artista) {
        this.Artista = Artista;
    }
  
    @Override
     public String getDescricaoCompleta()
     
     {
         return "CD: " + super.getDescrição()+ "Artista: " + Artista + "Gravadora: " + Gravadora;
     }
     
     public double getValorVenda()
     {
         return getPreco() * 1.1;
     }
}
