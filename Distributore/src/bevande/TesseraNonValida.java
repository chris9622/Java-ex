package bevande;

@SuppressWarnings("serial")
public class TesseraNonValida extends Exception {
    public TesseraNonValida(){
        super("Tessera non valida");
    }
}
