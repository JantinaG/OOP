
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");

		Dierenwinkel biancasWinkel = new Dierenwinkel("Bianca", 0623415623, "Hoofdstraat 20", true, 5);

		biancasWinkel.welcomeGuest();
		biancasWinkel.newAddress("Emmastraat 21");
		biancasWinkel.changeOpen();
		biancasWinkel.welcomeGuest();

		System.out.println(biancasWinkel.numberOfWorkers);
		biancasWinkel.addWorkers(2);
		System.out.println(biancasWinkel.numberOfWorkers);

		Dierenwinkel jantinasWinkel = new Dierenwinkel("Jantina", 061234456, "Achterweg 30", false, 0);
		jantinasWinkel.changeOpen();
		jantinasWinkel.welcomeGuest();

		Dierenwinkel kittysWinkel = new Dierenwinkel();
		kittysWinkel.welcomeGuest();
		kittysWinkel.address = "Woonstraat 3";
		kittysWinkel.welcomeGuest();
		System.out.println(kittysWinkel.address);

	}

}
