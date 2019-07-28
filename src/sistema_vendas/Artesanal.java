package sistema_vendas;

public class Artesanal extends Produtos{
    
    private double aliquota_impostoUnico;

    public Artesanal(double aliquota_impostoUnico, String descricao, double preco, double peso) {
        super(descricao, preco, peso);
        this.aliquota_impostoUnico = aliquota_impostoUnico;
    }

    public double getAliquota_impostoUnico() {
        return aliquota_impostoUnico;
    }

    public void setAliquota_impostoUnico(double aliquota_impostoUnico) {
        this.aliquota_impostoUnico = aliquota_impostoUnico;
    }

    @Override
    public String toString() {
        return String.format("%s.\n"
                             + "Aliquota Imposto Unico: %8.2f.\n",
                             super.toString(),
                             this.getAliquota_impostoUnico());
                             
    }
    
        public double calcularImpostos(){
        return this.getPreco() * 
                this.getAliquota_impostoUnico();
        
    }
    
    
}
