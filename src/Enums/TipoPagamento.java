
package Enums;
public enum TipoPagamento {
    DINHEIRO(0.05),
    CARTAO(0),
    PRAZO(0);
    
    private double desconto;

    private TipoPagamento(double desconto) {
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }
    
    
    
}
