package univavignon.m1ilsen.aa.sea.elevator.interface_;

import java.io.File;

import univavignon.m1ilsen.aa.sea.elevator.imp.ShaftCage;

public class ElevatorFactory {
	
	/**
	 * 
	 * @param setting 
	 * @return 
	 */
	public int buildElevator(File setting) { 
		ShaftCage elevator = new ShaftCage();
		ElevatorCommandFactory.setElevator(elevator);
		return 0;
	 } 

}
