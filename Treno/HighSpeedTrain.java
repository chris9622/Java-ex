public class HighSpeedTrain extends Treno{

	public HighSpeedTrain(int velocita) {
		super(velocita);
	}

	@Override
	public EnumPorte enterStation(Treno treno) {
		treno.stop(treno);
		if(treno.getVelocita()==0){
			return EnumPorte.Aperte;
		}
		return EnumPorte.Chiuse;
	}
}