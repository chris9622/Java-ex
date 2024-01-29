package bevande;

public class Bevanda {

    private String codice;
    private String bevanda;
    private double prezzo;

    public Bevanda(String codice, String bevanda, double prezzo) {
        this.codice = codice;
        this.bevanda = bevanda;
        this.prezzo = prezzo;
    }

    protected Bevanda() {
    }

    public String getCodice() {
        return codice;
    }

    public String getBevanda() {
        return bevanda;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public void setBevanda(String bevanda) {
        this.bevanda = bevanda;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "Bevanda{" +
                "codice='" + codice + '\'' +
                ", bevanda='" + bevanda + '\'' +
                ", prezzo=" + prezzo +
                '}';
    }
}
