package univavignon.m1ilsen.aa.sea.elevator.imp;

import univavignon.m1ilsen.aa.sea.elevator.interface_.IElevatorCommand;
import univavignon.m1ilsen.aa.sea.commontypes.ElevatorState;
import univavignon.m1ilsen.aa.sea.commontypes.Direction;

public class Elevator  {

	/**
	 * 
	 */
	public ElevatorState state;
	/**
	 * 
	 */
	public int position;
	/**
	 * 
	 */
	public Direction direction;
	/**
	 * Getter of state
	 */
	public ElevatorState getState() {
	 	 return state; 
	}
	/**
	 * Setter of state
	 */
	public void setState(ElevatorState state) { 
		 this.state = state; 
	}
	/**
	 * Getter of position
	 */
	public int getPosition() {
	 	 return position; 
	}
	/**
	 * Setter of position
	 */
	public void setPosition(int position) { 
		 this.position = position; 
	}
	/**
	 * Getter of direction
	 */
	public Direction getDirection() {
	 	 return direction; 
	}
	/**
	 * Setter of direction
	 */
	public void setDirection(Direction direction) { 
		 this.direction = direction; 
	}
	/**
	 * 
	 * @param speed  
	 */
	
	


	public void Openning() { 
		// TODO Auto-generated method
		
		state= ElevatorState.open;
	 }
	/**
	 * 
	 */
	public void closeDoor() { 
		// TODO Auto-generated method
		state = ElevatorState.closed;
	 }
	/**
	 * 
	 */
	public void computeTime() { 
		// TODO Auto-generated method
	 }
	

}
