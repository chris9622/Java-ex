package bevande;

public class Credito {

    private int codice;
    private double creditoDisponibile;

    public Credito(int codice, double creditoDisponibile) {
        this.codice = codice;
        this.creditoDisponibile = creditoDisponibile;
    }

    protected Credito() {

    }

    public int getCodice() {
        return codice;
    }

    public double getCreditoDisponibile() {
        return creditoDisponibile;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public void setCreditoDisponibile(double creditoDisponibile) {
        this.creditoDisponibile = creditoDisponibile;
    }

    @Override
    public String toString() {
        return "Credito{" +
                "codice=" + codice +
                ", creditoDisponibile=" + creditoDisponibile +
                '}';
    }
}
