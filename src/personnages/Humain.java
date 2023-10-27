package personnages;

public class Humain {
	
	private String name;
	private String favoriteDrink;
	private int amountOfMoney;
	
	
	public Humain(String name, String favoriteDrink, int amountOfMoney) {
		this.name = name;
		this.favoriteDrink = favoriteDrink;
		this.amountOfMoney = amountOfMoney;
	}

	public String getName() {
		return name;
	}

	public String favoriteDrink() {
		return favoriteDrink;
	}

	public int getAmountOfMoney() {
		return amountOfMoney;
	}

	private void speak(String texte) {
		System.out.println(texte);
	}
	public void sayHello() {
		speak("Bonjour ! Je m’appelle " + name + " et j’aime boire du " + favoriteDrink);
	}
	
	public void drink(String favoriteDrink){
		speak("Mmmm, un bon verre de " + favoriteDrink + "! GLOUPS !");
	}
	
	public void buy(String bien, int price) {
		if (amountOfMoney > price) {
			speak("J'ai " + amountOfMoney +" sous en poche. Je vais pouvoir m'offrir " + bien + " à " + price +" sous.");
		}
		else {
			speak("Je n'ai plus que "+ amountOfMoney + " sous en poche. Je ne peux même pas m'offrir un " + bien +" à "+ price +" sous.");
		}
	}
	
	public void gainMoney(int gain) {
		amountOfMoney += gain;
	}
	
	public void loseMoney(int loose) {
		amountOfMoney -= loose;
	}
	

}
