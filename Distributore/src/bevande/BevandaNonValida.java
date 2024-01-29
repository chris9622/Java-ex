package bevande;

@SuppressWarnings("serial")
public class BevandaNonValida extends Exception {

    public BevandaNonValida(String code) {
        super("Bevanda non valida: " + code);
    }

    public BevandaNonValida(){
        super("Bevanda non valida");
    }
}
