package things;

public class Truck extends Vehicle implements VehicleInterface {

	public Truck(String name, String color, int weight, Person owner, int numberofaxels) {
		super(name, color, weight, owner);
		setNumberOfAxels(numberofaxels);
	}

	private int NumberOfAxels;

	public int getNumberOfAxels() {
		return NumberOfAxels;
	}

	private void setNumberOfAxels(int numberOfAxels) {
		NumberOfAxels = numberOfAxels;
	}

}
