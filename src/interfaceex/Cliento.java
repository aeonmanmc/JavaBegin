package interfaceex;

public class Cliento {

	public static void main(String[] args) {

		Fish cod = new Cod();
		Fish roe = new Roe();

		Blackbox blackbox = new Blackbox();

		blackbox.setFish(cod);
		blackbox.showFishProperties();

		blackbox.setFish(roe);
		blackbox.showFishProperties();
	}
}
