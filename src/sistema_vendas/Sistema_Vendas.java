
package sistema_vendas;

import Enums.TipoPagamento;

public class Sistema_Vendas {


    public static void main(String[] args) throws Exception {
        Endereco end = new Endereco("AV.", "Brasil",
           "500", "Belo Horizonte", "MG", "30320-600");
        Cliente cli = new Cliente("111.111.111-11",
              "Joaquim da Silva", end, 1200.00);
        Venda ven = new Venda (cli,TipoPagamento.DINHEIRO);
        Produtos prod = new Artesanal(0.02,
        "Estatua Barroca", 80.0,0.1);
        ItemVenda iv = new ItemVenda (prod,2);
        try {        
              ven.addItemVenda(iv);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        prod = new Artesanal (0.02,"Brinco",
        14.0,0.05);
        iv = new ItemVenda (prod,3);
        try {        
              ven.addItemVenda(iv);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        prod = new Industrializado (0.12,0.05,
         "Xips",3.50,0.05) ;     
        iv = new ItemVenda (prod,5);
        try {        
              ven.addItemVenda(iv);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        
        System.out.println(ven.fecharvenda());
        
        
        
    }
    
    
    
}
