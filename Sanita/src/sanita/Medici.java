package sanita;

import java.util.HashSet;

public interface Medici extends Persona{

    public Medico getMedico(String matricola) throws ErrMedicoInesistente;
    public String getMatricola();
    public HashSet<Paziente> getPazienti();
}
