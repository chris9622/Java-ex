package biblio;

public class Main {

	public static void main(String[] args) {
		
		Biblioteca b = new Biblioteca(3, 30, 6, 10);

		Libro l1 = new Libro("AutoreBASE", "TitoloBASE");
		Libro l2 = new Libro("Antoine de Saint-Exupéry", "Il piccolo principe");
		Libro l3 = new Libro("J. R. R.", "Il Signore degli Anelli");
		Libro l4 = new Libro("J. K.", "H. P. e la pietra filosofale");
		Libro l5 = new Libro("J. K.", "H. P. e la camera dei segreti");

		b.add(l1, 1, "SC 1", 1);
		b.add(l2, 1, "SC 2", 1);
		b.add(l3, 1, "SC 3", 1);
		b.add(l4, 1, "SC 4", 1);
		b.add(l5, 3, "SC 30", 6);


		System.out.println("Metodo Cerca : " + b.cerca("Antoine de Saint-Exupéry", "Il piccolo principe" + "\n"));
		System.out.println("Metodo Contiene : " + b.contiene(1, "SC 2 ", 1, l2) + "\n");
		System.out.println("Metodo GetLibri : " + b.getLibri(1, "SC 1", 1));
		System.out.println("Metodo GetLibri : " + b.getLibri(3, "SC 30", 6));
		System.out.println("Metodo Posizione Libro: " + b.posizioneLibro(l4));

	}
}