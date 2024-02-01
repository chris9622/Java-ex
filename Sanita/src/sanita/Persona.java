package sanita;

public interface Persona {

   public Medici getMedico() throws ErrMedicoInesistente;

   public String getNome() ;

   public String getCognome() ;
}
