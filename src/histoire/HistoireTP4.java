package histoire;
import personnages.Commercant;
import personnages.Humain;

public class HistoireTP4 {
	
	public static void main(String[] args) {
		
		Humain hum1 = new Humain("Prof","kombucha",54);
		
		hum1.sayHello();
		hum1.buy("boisson",12);
		hum1.drink(hum1.favoriteDrink());
		hum1.buy("jeu",2);
		hum1.buy("kimono",50);
		System.out.println("\n");
		
		
		Commercant com1 = new Commercant("Marco",20);
		
		com1.sayHello();
		com1.seFaireExtorquer();
		com1.recevoir(15);
		com1.drink();
	}

}


