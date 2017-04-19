package vendas;

public class Carrinho 
{
private Vendavel [] vendaveis;
private int counter;

public Carrinho()
{
    vendaveis = new Vendavel[10];
    counter = 0;
}

public Vendavel[] getVendaveis()
{
    return vendaveis;
}

public int adicionaVendavel(Vendavel ven)
{
    vendaveis[counter++] = ven;
    return counter;
}

public Vendavel getVendavel(int index)
{
    return vendaveis[index];
}

public double calculoCompras()
{
    double valor = 0;
    for(int i = 0; i < vendaveis.length; i++)
    {
        valor += vendaveis[i].getValorVenda();
    }
    return valor;
}

}
