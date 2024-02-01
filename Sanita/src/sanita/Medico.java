package sanita;

import java.util.Collection;
import java.util.HashSet;

public class Medico extends Persone implements Medici {

     String matricola;
     HashSet<Paziente> pazienti;

    public Medico() {

    }

    public Medico(String nome, String cognome, String codiceFiscale, String matricola) {
        super(nome, cognome, codiceFiscale);
        this.matricola=matricola;
    }

    public Medico(String nome, String cognome, String codiceFiscale, String matricola, HashSet<Paziente> pazienti) {
        super(nome, cognome, codiceFiscale);
        this.matricola = matricola;
        this.pazienti= pazienti;
    }


    @Override
    public Medico getMedico(String matricola) {
        return null;
    }

    @Override
    public String getMatricola() {
        return matricola;
    }


    @Override
    public HashSet<Paziente> getPazienti() {
      return pazienti;
    }



    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    @Override
    public String toString() {
        return  super.toString() +"Medico{" +
                "matricola='" + matricola + '\'' +
                '}';
    }
}
