package biblio;

public class Libro {

	private String titolo;
	private String autore;
	private Ripiano ripiano;

	public Libro(String autore, String titolo) {
		this.autore = autore;
		this.titolo = titolo;
	}

	public String getTitolo() {
		return titolo;
	}

	public String getAutore() {
		return autore;
	}

	public Ripiano getRipiano() {
		return ripiano;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public void setRipiano(Ripiano ripiano) {
		this.ripiano = ripiano;
	}

	public String toString() {
		return autore + ", " + titolo;
	}
}
