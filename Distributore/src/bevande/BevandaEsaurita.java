package bevande;

@SuppressWarnings("serial")
public class BevandaEsaurita extends Exception {

    public BevandaEsaurita() {
        super("Bevanda esaurita");
    }
}
