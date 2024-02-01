package biblio;

import java.util.ArrayList;

public class Biblioteca {
  /**
   * Costruisce un oggetto bibioteca con 3 piani, 
   * 30 scaffali per piano, 6 ripiani per scaffale
   * ciascuno con posto per 10 libri
   */

  public ArrayList<Piano> piani;
  public int nPiani;
  public int nScaffali;
  public int nRipiani;
  public int nPosti;

  public Biblioteca(int piani, int scaffali, int ripiani, int posti) {
    this.piani = new ArrayList<>();
    this.nPiani = piani;
    this.nScaffali = scaffali;
    this.nRipiani = ripiani;
    this.nPosti = posti;
    for (int i = 1; i <= piani; i++) {
      Piano p = new Piano(scaffali, ripiani, posti);
      this.piani.add(p);
      p.setnPiano(i);
    }
  }
  
  /**
   * Aggiunge il libro specificato nel ripano, scaffale
   * e piano specificati.
   * @return <code>true</code> se l'inserimento � andato a buon fine
   */
  public boolean add(Libro libro, int piano, String scaffale, int ripiano) {
    if (piano > nPiani || ripiano > nRipiani || scaffale.length() > nScaffali) {
      System.out.println("\n" + "Fuori dai parametri Piano|Scaffale|Ripiano!" + "\n");
      return false;
    }
    ArrayList<Libro> libri = piani.get(piano - 1).getScaffali().get(scaffale).getRipiani().get(ripiano - 1).getLibri();
    if (libri.size() <= nPosti) {
      libri.add(libro);
      libro.setRipiano(piani.get(piano - 1).getScaffali().get(scaffale).getRipiani().get(ripiano - 1));
      return true;
    }
    System.out.println("Non ci sono più posti disponibili");
    return false;
  }

  /**
   * Verifica se il libro specificato si trova al
   * ripiano, scaffale e piano dati
   * @return <code>true</code> se il libro � presente
   */
  public boolean contiene(int piano, String scaffale, int ripiano, Libro libro) {
      if (piano > nPiani || ripiano > nRipiani || scaffale.length() > nScaffali) {
      System.out.println("\n" + "Fuori dai parametri Piano|Scaffale|Ripiano!" + "\n");
      return false;
    }
    ArrayList<Libro> libri = piani.get(piano - 1).getScaffali().get(scaffale).getRipiani().get(ripiano - 1).getLibri();
    for (int i = 0; i < libri.size(); i++) {
      if (libri.get(i).getAutore().equals(libro.getAutore()) && libri.get(i).getTitolo().equals(libro.getTitolo())) {
        return true;
      }
    }
    return false;
  }

  /**
   * Restituisce l'elenco dei libri contenuti in uno scaffale
   * Per ogni ripiano nella stringa compare l'indicazione del 
   * ripiano nella forma "Ripiano 1" seguito, nelle righe 
   * successive dai libri contenuti nel ripiano.
   */
  public String getLibri(int piano, String scaffale, int ripiano) {
      if (piano > nPiani || ripiano > nRipiani || scaffale.length() > nScaffali) {
        return ("\n" + "Fuori dai parametri Piano|Scaffale|Ripiano!" + "\n");
    }
    String elenco = "Piano " + piano + " Scaffale " + scaffale + " Ripiano " + ripiano +"\n";
    ArrayList<Libro> libri = piani.get(piano - 1).getScaffali().get(scaffale).getRipiani().get(ripiano - 1).getLibri();
    for (int i = 0; i < libri.size(); i++) {
      elenco += libri.get(i).getAutore() + ", " + libri.get(i).getTitolo() + "\n";
    }
    return elenco;
  }

  /**
   * Ricerca un libro inserito nella biblioteca in base
   * a autore e titolo. Se uno dei due � <code>null</code>
   * la ricerca viene fatta solo su un parametro.
   * @return il libro ricercata o <code>null</code> se
   * 		non � stato trovato alcun libro
   */
  public Libro cerca(String autore, String titolo) {
    Libro libri = new Libro(autore, titolo);
      if(autore != null && titolo != null && libri.getAutore().equals(autore) && libri.getTitolo().equals(titolo)){
        return libri;
      } else if(autore != null &&  libri.getAutore().equals(autore)){
        return libri;
      } else if(titolo != null && libri.getTitolo().equals(titolo)){
        return libri;
      }
    return null;
  }

  public String posizioneLibro(Libro libro){
    int piano = libro.getRipiano().getScaffale().getPiano().getnPiano();
    int scaffale = libro.getRipiano().getScaffale().getScaffale();
    int ripiano = libro.getRipiano().getRipiano();
    return "Il libro cercato si trova al Piano: " + piano + " Scaffale: " + scaffale + " Ripiano: " + ripiano;

  }
}