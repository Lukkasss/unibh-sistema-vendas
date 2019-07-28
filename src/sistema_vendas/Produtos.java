
package sistema_vendas;


public abstract class Produtos {
    private String descricao;
    private double preco, peso;
    private int id_prod;
    private static int contador_id =1;

    public String getDescricao() {
        return descricao;
    }
        public abstract double calcularImpostos();
            
       

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getId_prod() {
        return id_prod;
    }

    private void setId_prod() {
        this.id_prod = contador_id;
        contador_id++;
    }

    public Produtos(String descricao, double preco, double peso) {
        this.descricao = descricao;
        this.preco = preco;
        this.peso = peso;
        this.setId_prod();
    }
    public String toString(){
        return String.format("Codigo do produto: %d.\n"
                + "Descrição do produto: %s.\n"
                + "Preço do produto: %8.2f.\n"
                + "Peso do produto: %8.2f.\n", 
                this.getId_prod(),
                this.getDescricao(),
                this.getPreco(),
                this.getPeso());
    }
    
}
