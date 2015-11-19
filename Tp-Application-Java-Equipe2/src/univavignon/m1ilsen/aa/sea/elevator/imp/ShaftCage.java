package univavignon.m1ilsen.aa.sea.elevator.imp;

import univavignon.m1ilsen.aa.sea.commontypes.Direction;
import univavignon.m1ilsen.aa.sea.commontypes.ElevatorState;
import univavignon.m1ilsen.aa.sea.controlsystem.interface_.IElevatorNotifier;
import univavignon.m1ilsen.aa.sea.elevator.interface_.IElevatorCommand;

public class ShaftCage implements IElevatorCommand {

	private IElevatorNotifier iElevatorNotifier;
	
	@Override
	public void stopAtLevel() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move(Direction direction) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * Setter of iElevatorNotifier
	 */
	public void setIElevatorNotifier(IElevatorNotifier iElevatorNotifier) { 
		 this.iElevatorNotifier = iElevatorNotifier; 
	}


}
