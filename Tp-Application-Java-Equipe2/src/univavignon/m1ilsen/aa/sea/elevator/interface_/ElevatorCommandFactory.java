package univavignon.m1ilsen.aa.sea.elevator.interface_;

import univavignon.m1ilsen.aa.sea.elevator.imp.DummyElevator;
import univavignon.m1ilsen.aa.sea.controlsystem.interface_.IElevatorNotifier;

public class ElevatorCommandFactory {

	/**
	 * 
	 */
	private static DummyElevator elevator;

	/**
	 * 
	 * @param elevator 
	 */
	public static void setElevator(DummyElevator elev) { 
		 elevator = elev; 
	}

	/**
	 * 
	 * @param IEN 
	 * @return 
	 */
	public static IElevatorCommand getElevatorCommand(IElevatorNotifier IEN) { 
		if (elevator != null) { elevator.setIElevatorNotifier(IEN); }
		return elevator;
	 } 

}
