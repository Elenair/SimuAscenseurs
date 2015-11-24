package univavignon.m1ilsen.aa.sea.elevator.imp;

import univavignon.m1ilsen.aa.sea.elevator.interface_.IElevatorCommand;
import univavignon.m1ilsen.aa.sea.commontypes.ElevatorState;
import univavignon.m1ilsen.aa.sea.commontypes.Direction;

public class Elevator  {

	/**
	 * 
	 */
	public long temp_ouv;
	public long temp_ferm;
	public long temp_attente;
	
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
	 * @throws InterruptedException 
	 */
	
	


	public void Openning(long t) throws InterruptedException { 
	
		// TODO Auto-generated method
		temp_ouv = t;
		wait(temp_ouv);
		state= ElevatorState.open;
	 }
	/**
	 * @throws InterruptedException 
	 * 
	 */
	public void closeDoor(long t) throws InterruptedException { 
		// TODO Auto-generated method
		temp_ferm = t;
		wait(temp_ferm);
		state = ElevatorState.closed;
	 }
	/**
	 * 
	 */
	public long computeTime(long t) { 
		// TODO Auto-generated method
		temp_attente = t;
		return (temp_attente + temp_ferm + temp_ouv);
	 }
	

}
