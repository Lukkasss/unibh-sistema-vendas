package sistema_vendas;

public class Industrializado extends Produtos {

    private double aliquota_ICMS, aliquota_IPI;

    public Industrializado(double aliquota_ICMS, double aliquota_IPI, String descricao, double preco, double peso) {
        super(descricao, preco, peso);
        this.aliquota_ICMS = aliquota_ICMS;
        this.aliquota_IPI = aliquota_IPI;
    }

    public double getAliquota_ICMS() {
        return aliquota_ICMS;
    }

    public void setAliquota_ICMS(double aliquota_ICMS) {
        this.aliquota_ICMS = aliquota_ICMS;
    }

    public double getAliquota_IPI() {
        return aliquota_IPI;
    }

    public void setAliquota_IPI(double aliquota_IPI) {
        this.aliquota_IPI = aliquota_IPI;
    }

    public String toString(){
        return String.format("%s.\n"
                             + "Aliquota ICMS: %8.2f.\n"
                             + "Aliquota IPI: %8.2f.\n",
                             super.toString(),
                             this.getAliquota_ICMS(),
                             this.getAliquota_IPI());
    }
    
    public double calcularImpostos(){
        return this.getPreco() * (
                this.getAliquota_IPI()+
                this.getAliquota_ICMS());
        
    }
    
}
