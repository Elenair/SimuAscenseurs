package univavignon.m1ilsen.aa.sea.elevatorui.interface_;

import univavignon.m1ilsen.aa.sea.elevatorui.imp.ElevatorUIDummy;
import univavignon.m1ilsen.aa.sea.commontypes.Direction;
import univavignon.m1ilsen.aa.sea.flow.interface_.IUser;

public class UIElevatorRequestFactory {

	/**
	 * 
	 */
	public ElevatorUIDummy elevatorUIDummy;
	
	public UIElevatorRequestFactory() {
		elevatorUIDummy = new ElevatorUIDummy(0,Direction.none,null);
	}

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
	 * 
	 * @param level 
	 * @param direction 
	 * @param user 
	 */
	public void createCall(int level, Direction direction, IUser user) { 
		elevatorUIDummy.addCall(level,direction,user);
	 }

	/**
	 * 
	 * @param level 
	 * @param user 
	 */
	public void createMove(int level, IUser user) { 
		elevatorUIDummy.addMove(level,user);
	 } 

}
