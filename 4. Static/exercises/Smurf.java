package exercises;

public class Smurf {

	private int number;
	private static String name;
	private static int instance = 0;

	public static Smurf createSmurf(String name) {
		if (Smurf.name!=name) { System.out.println("Creating " + name + " Smurf"); } return new Smurf(name);
	}

	public Smurf(String name) {
		this.name = name;
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
		Smurf.createSmurf("Smurfette");
		Smurf.createSmurf("Smurfette");
		Smurf.createSmurf("Papa");
	}

}

