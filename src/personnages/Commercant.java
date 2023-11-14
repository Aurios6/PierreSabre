package personnages;


public class Commercant extends Humain {

	
	private static final String TH� = "th�";

	public Commercant(String name, int amountOfMoney) {
		super(name,TH�, amountOfMoney);
	}
	
	public int seFaireExtorquer() {
		speak("Le monde est vraiment trop injuste");
		loseMoney(getAmountOfMoney());
		return getAmountOfMoney();
	}
	
	public void recevoir(int sommes) {
		gainMoney(sommes);
		speak(sommes + " sous! Je te remercie g�n�reux donateur!");
	}
	
	public void drink(){
		drink(TH�);
	}
}
