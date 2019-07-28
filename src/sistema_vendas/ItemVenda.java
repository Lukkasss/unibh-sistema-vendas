
package sistema_vendas;

public class ItemVenda {

    private Produtos prod;
    private double qtde;
    private double valTot;
    
    public void calcValTot(){
        this.valTot = prod.getPreco()*this.qtde;
        
    } 

    public double getValTot() {
        return valTot;
    }

    public ItemVenda(Produtos prod, double qtde) {
        this.prod = prod;
        this.qtde = qtde;
    }

    public Produtos getProd() {
        return prod;
    }

    public void setProd(Produtos prod) {
        this.prod = prod;
    }

    public double getQtde() {
        return qtde;
    }

    public void setQtde(double qtde) {
        this.qtde = qtde;
    }
    
    
    
}
