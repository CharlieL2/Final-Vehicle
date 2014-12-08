package things;

public class Car extends Vehicle implements VehicleInterface{

	public Car(String name, String color, int weight, Person owner, int numberofdoors) {
		super(name, color, weight, owner);
		setNumberOfDoors(numberofdoors);
	}

	private int NumberOfDoors;

	public int getNumberOfDoors() {
		return NumberOfDoors;
	}

	private void setNumberOfDoors(int numberOfDoors) {
		NumberOfDoors = numberOfDoors;
	}

}
