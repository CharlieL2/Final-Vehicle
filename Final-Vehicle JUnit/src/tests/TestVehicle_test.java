package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import things.*;

public class TestVehicle_test {

	@Test
	public void test1() {
		TestVehicle Tester = new TestVehicle();
		assertEquals("Owner Truck Test",Tester.toyota.getOwner(),Tester.JP);
		assertEquals("Owner Car Test",Tester.honda.getOwner(),Tester.JD);
		assertEquals("Owner MotorCycle Test",Tester.viper.getOwner(),Tester.JP);
	}
	
	@Test
	public void test2() {
		TestVehicle Tester = new TestVehicle();
		assertEquals("Axel Truck Test",Tester.toyota.getNumberOfAxels(),2);
		assertEquals("Doors Car Test",Tester.honda.getNumberOfDoors(),4);
		assertEquals("Sidecar MotorCycle Test",Tester.viper.isHasSideCar(),false);
	}
	
	@Test
	public void test3() {
		TestVehicle Tester = new TestVehicle();
		assertEquals("Weight Truck Test",Tester.toyota.getWeight(),3);
		assertEquals("Weight Car Test",Tester.honda.getWeight(),2);
		assertEquals("Weight MotorCycle Test",Tester.viper.getWeight(),1);
	}

}
