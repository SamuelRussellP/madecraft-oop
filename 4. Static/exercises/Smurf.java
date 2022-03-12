package exercises;

public class Smurf {

	private int number;
	private String name;
	private static int instance = 0;

	public static Smurf createSmurf(String name) {
		if (instance > 1) {
			System.out.println("This smurf had been created previously");
		}
		else {
			System.out.println("Creating " + name + " Smurf");
			return new Smurf(name);
		}
		return null;
	}

	private Smurf(String name) {
		this.name = name;
		++instance;
		this.number = instance;
	}

	public void printName() {
		System.out.println("My name is " + name + " Smurf.");
	}

	public void eat() {
		System.out.println(name + " Smurf is eating Smurfberries.");
	}

	public int getNumber() {
		return number;
	}

	public static void main(String[] args){
		Smurf.createSmurf("Papa");
		Smurf.createSmurf("Mama");
		Smurf.createSmurf("Smurfette");
		Smurf.createSmurf("Papa");
		Smurf.createSmurf("Papa");
		Smurf.createSmurf("Papa");
		Smurf.createSmurf("Smurfette");
	}

}

