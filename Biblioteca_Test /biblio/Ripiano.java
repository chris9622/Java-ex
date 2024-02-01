package biblio;
import java.util.ArrayList;

public class Ripiano {

	private ArrayList<Libro> libri = new ArrayList<>();
	private Scaffale scaffale;
	private int nPosti;
	private int ripiano;

	public Ripiano(Scaffale scaffale) {
		this.scaffale = scaffale;
	}

	public ArrayList<Libro> getLibri() {
		return libri;
	}

	public Scaffale getScaffale() {
		return scaffale;
	}

	public int getRipiano() {
		return ripiano;
	}

	public void setScaffale(Scaffale scaffale) {
		this.scaffale = scaffale;
	}

	public void setRipiano(int ripiano) {
		this.ripiano = ripiano;
	}

	public int getnPosti() {
		return nPosti;
	}

	public void setnPosti(int nPosti) {
		this.nPosti = nPosti;
	}
}
