package univavignon.m1ilsen.aa.sea.controlsystem.interface_;

import univavignon.m1ilsen.aa.sea.commontypes.ElevatorState;

public interface IElevatorNotifier {

	/**
	 * 
	 * @param level 
	 */
	public void notifyLevel(int level, long t);

	/**
	 * 
	 * @param elevatorState 
	 */
	public void notifyState(ElevatorState elevatorState, long t);

	/**
	 * 
	 * @param level 
	 */
	public void notifyLevel(int level);

	/**
	 * 
	 * @param elevatorState 
	 */
	public void notifyState(ElevatorState elevatorState); 

}
