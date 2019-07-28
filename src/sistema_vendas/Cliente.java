
package sistema_vendas;

import Enums.TipoCliente;

public class Cliente {
    private int id_cliente;
    private static int contadorID = 1;
    private String CPF,Nome;
    private Endereco endereco;
    private double renda;
    private TipoCliente tpcliente;
    
    public String toString(){
        return String.format("Id do cliente: %d.\n"
                +"Cpf: %s.\n"
                + "Nome: %s.\n"
                + "%s.\n"
                + "Renda: %8.2f.\n"
                + "Tipo do cliente: %s.\n"
                + "Limite de crédito: %8.2f.\n",
                this.id_cliente,
                this.CPF,
                this.Nome,
                this.endereco.toString(),
                this.renda,
                this.tpcliente.toString(),
                this.tpcliente.getLimCredito());
               
    }

    public int getId_cliente() {
        return id_cliente;
    }

    private void setId_cliente() {
        this.id_cliente = contadorID;
        contadorID++;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
        this.setTpcliente
            (TipoCliente.ClassificarCliente(renda));
    }

    public TipoCliente getTpcliente() {
        return tpcliente;
    }

    private void setTpcliente(TipoCliente tpcliente) {
        this.tpcliente = tpcliente;
    }
    
    
    public Cliente(String CPF, String Nome, Endereco endereco, double renda) {
        this.CPF = CPF;
        this.Nome = Nome;
        this.endereco = endereco;
        this.renda = renda;
        this.setTpcliente
            (TipoCliente.ClassificarCliente(renda));
        this.setId_cliente();
    }
    
    
    
    
}
