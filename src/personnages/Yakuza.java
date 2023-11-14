package personnages;

public class Yakuza extends Humain {
	
	
	public String clan;
	public int reputation = 0;
	
	public Yakuza(String name, String favoriteDrink, int amountOfMoney, String clan) {
		super(name, favoriteDrink, amountOfMoney);
		this.clan = clan;
		this.reputation = reputation;
	}
	
	public void extorquer(Commercant victime) {
		speak(victime.getName() + " à l'air faible");
		speak("J’ai piqué les "+ victime.getAmountOfMoney() + " sous de " + victime.getName() +" , ce qui me fait " + (getAmountOfMoney() +victime.getAmountOfMoney())  +" sous dans poche. Hi ! Hi !");
		victime.seFaireExtorquer();
		gainMoney(victime.getAmountOfMoney());
		reputation ++;

	}
}

