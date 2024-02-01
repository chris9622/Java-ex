
public class Main {

	public static void main(String[] args) {
		Treno treno = new Treno(0);
		HighSpeedTrain hsTrain = new HighSpeedTrain(0);
		RegionalTrain rTrain = new RegionalTrain(0);

		System.out.println("Test Type Treno");
		treno.setEnumPorte(EnumPorte.Chiuse);
		treno.setVelocita(100);
		System.out.println("Type Treno: " + treno.getVelocita() + "Km/h" + " " + "Porte: " + treno.getEnumPorte());
		System.out.println("Arrivo alla stazione");
		treno.enterStation(treno);
		System.out.println("Type Treno: " + treno.getVelocita() + "Km/h" + " " + "Porte: " + treno.getEnumPorte());

		System.out.println("Test Type HighSpeedTrain");
		hsTrain.setEnumPorte(EnumPorte.Chiuse);
		hsTrain.setVelocita(300);
		System.out.println("Type HighSpeedTrain: " + hsTrain.getVelocita() + "Km/h" + " " + "Porte: " + hsTrain.getEnumPorte());
		System.out.println("Arrivo alla stazione");
		hsTrain.enterStation(hsTrain);
		System.out.println("Type HighSpeedTrain: " + hsTrain.getVelocita() + "Km/h" + " " + "Porte: " + hsTrain.getEnumPorte());

		System.out.println("Test Type RegionalTrain");
		rTrain.setEnumPorte(EnumPorte.Chiuse);
		rTrain.setVelocita(100);
		System.out.println("Type RegionalTrain: " + rTrain.getVelocita() + "Km/h" + " " + "Porte: " + rTrain.getEnumPorte());
		System.out.println("Arrivo alla stazione");
		rTrain.enterStation(rTrain);
		System.out.println("Type RegionalTrain: " + rTrain.getVelocita() + "Km/h" + " " + "Porte: " + rTrain.getEnumPorte());
	}
}
