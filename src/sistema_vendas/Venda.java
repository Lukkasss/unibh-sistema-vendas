package sistema_vendas;

import Enums.TipoPagamento;
import java.util.ArrayList;

public class Venda {

    private Cliente cliente;
    private double totalimposto;
    private double totalvenda;
    private double desconto;
    private TipoPagamento formapgto;
    private ArrayList<ItemVenda> listaProd
            = new ArrayList<ItemVenda>();

    public void addItemVenda(ItemVenda iv) throws Exception {
        this.calcularTotalVenda();
        if (totalvenda + iv.getValTot()
                <= this.cliente.getTpcliente().getLimCredito()
                || this.formapgto != TipoPagamento.PRAZO) {
            iv.calcValTot();
            this.listaProd.add(iv);
            
        } else {
            throw new Exception("Limite ultrapassado");
        }

        
        
    }

    public Venda(Cliente cliente, TipoPagamento formapgto) {
        this.cliente = cliente;
        this.formapgto = formapgto;
    }
    
    public String imprimirRecibo(){
        String produtos = null;
        for(ItemVenda iv : listaProd){
            produtos += String.format(
            "Descrição: %s.\n"
          + "Valor Unitário: %.2f.\n"
          + "Quantidade: %.2f.\n"
          + "Valor Total: %.2f.\n", 
            iv.getProd().getDescricao(),
            iv.getProd().getPreco(),
            iv.getQtde(),
            iv.getValTot());
            
        }
        
        return String.format("Nome: %s.\n"
                + "CPF: %s.\n"
                + "Total da venda: %.2f.\n"
                + "Total de impostos: %.2f.\n"
                + "Desconto: %.2f.\n"
                + "Total Geral: %.2f.\n"
                + "%s",this.cliente.getNome(),
                this.cliente.getCPF(),
                this.totalvenda,
                this.totalimposto,
                this.desconto,
                this.totalvenda - this.desconto,
                produtos
               
        );
                
        
                
    }
    public String fecharvenda() {
        this.calcularTotImpostos();
        this.calcularTotalVenda();
        this.calcularDesconto();
        return this.imprimirRecibo();
        
    }

    public void calcularTotImpostos() {
        for (ItemVenda iv : listaProd) {
            this.totalimposto
                    += iv.getProd().calcularImpostos()
                    * iv.getQtde();
        }
    }

    public void calcularTotalVenda() {
        this.totalvenda = 0;
        for (ItemVenda iv : listaProd) {

            this.totalvenda
                    += iv.getValTot();
        }
    }

    public void calcularDesconto() {
        if (formapgto
                == TipoPagamento.DINHEIRO) {
            this.desconto = this.totalvenda
                    * this.formapgto.getDesconto();
        }

    }

}
