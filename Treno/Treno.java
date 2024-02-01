public class Treno {

	private int velocita;
	private EnumPorte enumPorte;

	public Treno(int velocita) {
		this.velocita = velocita;
	}

	public int getVelocita() {
		return velocita;
	}

	public void setVelocita(int velocita) {
		this.velocita = velocita;
	}

	public EnumPorte getEnumPorte() {
		return enumPorte;
	}

	public void setEnumPorte(EnumPorte enumPorte) {
		this.enumPorte = enumPorte;
	}

	// Stop treno
	public void stop(Treno treno){
		treno.setVelocita(0);
	}

	//enterStation stop al treno ed apre le porte
	public EnumPorte enterStation(Treno treno){
		treno.stop(treno);
		return enumPorte.Aperte;
	}

	// setDoors boolean prende in input un booleano apre o chiude le porte
	public void setDoors(boolean value){
		if(value==true){
			setEnumPorte(EnumPorte.Aperte);

		}  setEnumPorte(EnumPorte.Chiuse);
	}
}
