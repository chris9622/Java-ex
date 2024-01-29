package bevande;

public class ApprovigionamentoDistributore {

    private int numColonna;
    private String nomeBibita;

    private int lattine;

    public ApprovigionamentoDistributore(int numColonna, String nomeBibita, int lattine) {
        this.numColonna = numColonna;
        this.nomeBibita = nomeBibita;
        this.lattine = lattine;
    }

    protected ApprovigionamentoDistributore() {
    }

    public int getNumColonna() {
        return numColonna;
    }

    public String getNomeBibita() {
        return nomeBibita;
    }

    public int getLattine() {
        return lattine;
    }

    public void setNumColonna(int numColonna) {
        this.numColonna = numColonna;
    }

    public void setNomeBibita(String nomeBibita) {
        this.nomeBibita = nomeBibita;
    }

    public void setLattine(int lattine) {
        this.lattine = lattine;
    }

    @Override
    public String toString() {
        return "ApprovigionamentoDistributore{" +
                "numColonna=" + numColonna +
                ", nomeBibita='" + nomeBibita + '\'' +
                ", lattine=" + lattine +
                '}';
    }
}
