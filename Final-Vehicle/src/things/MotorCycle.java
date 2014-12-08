package things;

public class MotorCycle extends Vehicle implements VehicleInterface {

	public MotorCycle(String name, String color, int weight, Person owner, boolean hassidecar) {
		super(name, color, weight, owner);
		setHasSideCar(hassidecar);
	}

	private boolean hasSideCar;

	public boolean isHasSideCar() {
		return hasSideCar;
	}

	private void setHasSideCar(boolean hasSideCar) {
		this.hasSideCar = hasSideCar;
	}

}
