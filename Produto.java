package vendas;

public abstract class Produto {
    
    private int Codigo;
    private String Descricao;
    private double Preco;
    
    public Produto(int Codigo, String Descricao, double Preco)
            
    {
    this.Codigo = Codigo;
    this.Descricao = Descricao;
    this.Preco = Preco;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getDescrição() {
        return Descricao;
    }

    public void setDescrição(String Descricao) {
        this.Descricao = Descricao;
    }

    public double getPreco() {
        return Preco;
    }

    public void setPreco(double Preco) {
        this.Preco = Preco;
    }
    
   public abstract String getDescricaoCompleta();
    
}
