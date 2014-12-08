package things;

public class TestVehicle {
	
public Truck toyota;
public Car honda;
public MotorCycle viper;
public Person JD,JP;

	public TestVehicle(){
		
		JD = new Person("John", "Doe");
		JP = new Person("Jane", "Paper");
		
		honda = new Car("Camry", "silver", 2,JD, 4);
		toyota = new Truck("Ram", "red", 3,JD, 2);
		toyota.transferOwnership(JP); //NOOOOOooo
		
		viper = new MotorCycle("viper", "blue", 1, JP,false);
		
		
	}
}
