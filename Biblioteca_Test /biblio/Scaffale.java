package biblio;
import java.util.ArrayList;

public class Scaffale {

	private ArrayList<Ripiano> ripiani = new ArrayList<>();
	private Piano piano;
	private int scaffale;

	public Scaffale(Piano piano, int ripiano){
		for (int i = 1; i <= ripiano; i++) {
			Ripiano r = new Ripiano(this);
			ripiani.add(r);
			r.setRipiano(i);
		}
		this.piano = piano;
	}

	public ArrayList<Ripiano> getRipiani() {
		return ripiani;
	}

	public Piano getPiano() {
		return piano;
	}
	
	public int getScaffale() {
		return scaffale;
	}

	public void setScaffale(int scaffale) {
		this.scaffale = scaffale;
	}

	public void setPiano(Piano piano) {
		this.piano = piano;
	}
}
