package sanita;

public class Persone implements Persona {

    private String nome;

    private String cognome;

    private String codiceFiscale;

    protected Persone(){

    }
    public Persone(String nome, String cognome, String codiceFiscale) {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceFiscale = codiceFiscale;
    }


    @Override
    public Medici getMedico() throws ErrMedicoInesistente {
        return null;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getCognome() {
        return cognome;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    @Override
    public String toString() {
        return
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", codiceFiscale='" + codiceFiscale + '\'' +
                '}';
    }
}
