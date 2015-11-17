package univavignon.m1ilsen.aa.sea.elevator.imp;

import univavignon.m1ilsen.aa.sea.sequencer.interface_.Event;
import univavignon.m1ilsen.aa.sea.elevator.interface_.IElevatorCommand;
import univavignon.m1ilsen.aa.sea.commontypes.Direction;
import univavignon.m1ilsen.aa.sea.controlsystem.interface_.IElevatorNotifier;

public class Engine implements Event, IElevatorCommand {

	/**
	 * 
	 */
	public IElevatorNotifier iElevatorNotifier;
	/**
	 * 
	 */
	public double speed;
	/**
	 * Getter of iElevatorNotifier
	 */
	public IElevatorNotifier getIElevatorNotifier() {
	 	 return iElevatorNotifier; 
	}
	/**
	 * Setter of iElevatorNotifier
	 */
	public void setIElevatorNotifier(IElevatorNotifier iElevatorNotifier) { 
		 this.iElevatorNotifier = iElevatorNotifier; 
	}
	/**
	 * Getter of speed
	 */
	public double getSpeed() {
	 	 return speed; 
	}
	/**
	 * Setter of speed
	 */
	public void setSpeed(double speed) { 
		 this.speed = speed; 
	}
	/**
	 * 
	 */
	public void Operation1() { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 */
	public void stopAtLevel() { 
		// TODO Auto-generated method
	 }
	public void stopAtLevel(int level) { 
		// TODO Auto-generated method
	 }
	@Override
	public void move(Direction direction) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void trigger(long t) {
		// TODO Auto-generated method stub
		
	} 

}
