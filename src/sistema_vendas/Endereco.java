package sistema_vendas;

public class Endereco {
    private String tipo_Logradouro;
    private String Numero;
    private String Logradouro;
    private String Cidade,Estado,CEP;

    public String getTipo_Logradouro() {
        return tipo_Logradouro;
    }

    public void setTipo_Logradouro(String tipo_Logradouro) {
        this.tipo_Logradouro = tipo_Logradouro;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public String getLogradouro() {
        return Logradouro;
    }

    public void setLogradouro(String Logradouro) {
        this.Logradouro = Logradouro;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public Endereco(String tipo_Logradouro, String Numero, String Logradouro, String Cidade, String Estado, String CEP) {
        this.tipo_Logradouro = tipo_Logradouro;
        this.Numero = Numero;
        this.Logradouro = Logradouro;
        this.Cidade = Cidade;
        this.Estado = Estado;
        this.CEP = CEP;
    }
    
    public String toString(){
        return String.format("%s %s, %s. %s - %s. CEP: %s.\n",
        this.tipo_Logradouro,
        this.Logradouro,
        this.Numero,
        this.Cidade,
        this.Estado,this.CEP);
    }
}
