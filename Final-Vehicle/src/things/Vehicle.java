package things;

public abstract class Vehicle implements VehicleInterface{

	private String Name, Color;
	int Weight;
	private Person Owner;
	
	public Vehicle(String name, String color, int weight, Person owner){
		setName(name);
		setColor(color);
		setWeight(weight);
		setOwner(owner);
	}
	
	public String getName() {
		return Name;
	}

	private void setName(String name) {
		Name = name;
	}

	public String getColor() {
		return Color;
	}

	private void setColor(String color) {
		Color = color;
	}

	public int getWeight() {
		return Weight;
	}

	private void setWeight(int weight) {
		Weight = weight;
	}

	public void transferOwnership(Person newOwner){
		setOwner(newOwner);
	}

	public Person getOwner() {
		return Owner;
	}

	private void setOwner(Person owner) {
		Owner = owner;
	}
}
