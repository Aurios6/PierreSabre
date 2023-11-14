package personnages;


public class Commercant extends Humain {

	
	private static final String THÉ = "thé";

	public Commercant(String name, int amountOfMoney) {
		super(name,THÉ, amountOfMoney);
	}
	
	public int seFaireExtorquer() {
		speak("Le monde est vraiment trop injuste");
		loseMoney(getAmountOfMoney());
		return getAmountOfMoney();
	}
	
	public void recevoir(int sommes) {
		gainMoney(sommes);
		speak(sommes + " sous! Je te remercie généreux donateur!");
	}
	
	public void drink(){
		drink(THÉ);
	}
}
