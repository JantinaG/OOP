
public class Dierenwinkel {
	// Properties
	public String owner;
	public int telephone;
	public String address;
	public boolean isOpen;
	public int numberOfWorkers;

	// Constructors
	public Dierenwinkel() {
		this.owner = "Kitty";
		this.isOpen = false;
	}

	public Dierenwinkel(String owner, int telephone, String address, boolean isOpen, int numberOfWorkers) {
		this.owner = owner;
		this.telephone = telephone;
		this.address = address;
		this.isOpen = isOpen;
		this.numberOfWorkers = numberOfWorkers;
	}

	// Methods
	public void welcomeGuest() {
		System.out.println("Welcome to " + owner + "'s Dierenwinkel!");
		System.out.println("Are we open? " + isOpen);
	}

	public boolean changeOpen() {
		isOpen = !isOpen;

		return isOpen;
	}

	public int addWorkers(int newWorkers) {
		return numberOfWorkers += newWorkers;
	}

	public void newAddress(String address) {
		this.address = address;
	}

}
