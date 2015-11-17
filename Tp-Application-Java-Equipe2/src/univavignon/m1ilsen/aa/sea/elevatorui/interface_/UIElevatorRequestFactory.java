package univavignon.m1ilsen.aa.sea.elevatorui.interface_;

import univavignon.m1ilsen.aa.sea.elevatorui.imp.ElevatorUIDummy;
import univavignon.m1ilsen.aa.sea.elevatorui.imp.UIElevator;
import univavignon.m1ilsen.aa.sea.commontypes.Direction;
import univavignon.m1ilsen.aa.sea.flow.interface_.IUser;

public class UIElevatorRequestFactory {

	/**
	 * 
	 */
	public ElevatorUIDummy elevatorUIDummy;
	/**
	 * 
	 */
	public UIElevator int_elevator;
	/**
	 * 
	 */
	public UIElevator uIElevator;
	/**
	 * Getter of elevatorUIDummy
	 */
	public ElevatorUIDummy getElevatorUIDummy() {
	 	 return elevatorUIDummy; 
	}
	/**
	 * Setter of elevatorUIDummy
	 */
	public void setElevatorUIDummy(ElevatorUIDummy elevatorUIDummy) { 
		 this.elevatorUIDummy = elevatorUIDummy; 
	}
	/**
	 * Getter of int_elevator
	 */
	public UIElevator getInt_elevator() {
	 	 return int_elevator; 
	}
	/**
	 * Setter of int_elevator
	 */
	public void setInt_elevator(UIElevator int_elevator) { 
		 this.int_elevator = int_elevator; 
	}
	/**
	 * Getter of uIElevator
	 */
	public UIElevator getUIElevator() {
	 	 return uIElevator; 
	}
	/**
	 * Setter of uIElevator
	 */
	public void setUIElevator(UIElevator uIElevator) { 
		 this.uIElevator = uIElevator; 
	}
	/**
	 * 
	 * @param level 
	 * @param direction 
	 * @param user 
	 */
	public void createCall(int level, Direction direction, IUser user) { 
		elevatorUIDummy.addCall(level, direction, user);
	 }
	/**
	 * 
	 * @param level 
	 * @param user 
	 */
	public void createMove(int level, IUser user) { 
		elevatorUIDummy.addMove(level, user);
	 } 

}
