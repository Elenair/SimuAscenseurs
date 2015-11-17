package univavignon.m1ilsen.aa.sea.elevator.interface_;

import univavignon.m1ilsen.aa.sea.commontypes.Direction;

public interface IElevatorCommand {

	/**
	 * 
	 */
	public void stopAtLevel();

	/**
	 * 
	 * @param direction 
	 */
	public void move(Direction direction); 

}
