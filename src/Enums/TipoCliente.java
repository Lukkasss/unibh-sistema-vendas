package Enums;

public enum TipoCliente {
    COMUM(600),
    ESPECIAL(2000),
    VIP(5000);

    private double LimCredito;

    private TipoCliente(double LimCredito) {
        this.LimCredito = LimCredito;
    }

    public double getLimCredito() {
        return LimCredito;
    }

    public static TipoCliente ClassificarCliente(double Renda) {
        if (Renda <= 3000) {
            return COMUM;
        } else if (Renda >= 3000.01 && Renda <= 6000) {
            return ESPECIAL;
        } else {
            return VIP;
        }

    }

}
