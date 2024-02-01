package sanita;

public class Paziente extends Persone  {
    Medico medico;

    public Paziente(Medico medico) {

    }

    public Paziente(String nome, String cognome, String codiceFiscale, Medico medico) {
        super(nome,cognome, codiceFiscale);
        this.medico=medico;
    }

    public Paziente(String nome,String cognome, String codiceFiscale) {
        super(nome,cognome, codiceFiscale);
    }

    @Override
    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    @Override
    public String toString() {
        return  "Paziente: " + super.toString();
    }



}
