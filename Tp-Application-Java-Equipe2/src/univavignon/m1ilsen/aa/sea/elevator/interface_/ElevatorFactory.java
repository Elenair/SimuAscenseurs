package univavignon.m1ilsen.aa.sea.elevator.interface_;

import java.io.File;

import univavignon.m1ilsen.aa.sea.elevator.imp.DummyElevator;

public class ElevatorFactory {
	
	/**
	 * 
	 * @param setting 
	 * @return 
	 */
	public int buildElevator(File setting) { 
		DummyElevator elevator = new DummyElevator();
		ElevatorCommandFactory.setElevator(elevator);
		return 0;
	 } 

}
