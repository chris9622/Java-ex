package biblio;

import java.util.HashMap;

public class Piano {

	private HashMap<String, Scaffale> scaffali;
	private int nPiano;

	public Piano(int scaffale, int ripiani, int posti){
		scaffali = new HashMap<>();
		for (int i = 1; i <= scaffale; i++) {
			Scaffale s = new Scaffale(this, ripiani);
			scaffali.put("SC " + i, s);
			s.setScaffale(i);
			s.getRipiani().forEach(ripiano -> ripiano.setnPosti(posti));
		}
	}

	public HashMap<String, Scaffale> getScaffali() {
		return scaffali;
	}
	
	public void setScaffali(HashMap<String, Scaffale> scaffali) {
		this.scaffali = scaffali;
	}

	public int getnPiano() {
		return nPiano;
	}

	public void setnPiano(int nPiano) {
		this.nPiano = nPiano;
	}

	public String toString() {
		String s = "";
		for (String key : scaffali.keySet()) {
			s = s + key + " " + scaffali.get(key).toString() + "\n";
		}
		return s;
	}
}

