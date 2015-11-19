package univavignon.m1ilsen.aa.sea.elevatorui.imp;

import univavignon.m1ilsen.aa.sea.commontypes.Direction;
import univavignon.m1ilsen.aa.sea.elevator.imp.Elevator;
import univavignon.m1ilsen.aa.sea.flow.imp.Notify;
import univavignon.m1ilsen.aa.sea.flow.imp.User;
import univavignon.m1ilsen.aa.sea.flow.interface_.IUser;

public class UIElevator {

	/**
	 * 
	 * @param level 
	 * @param direction 
	 * @param user 
	 */
	Notify not;
	
	public void add_request(int level, Direction direction, IUser user) { 
		// TODO Auto-generated method
		not.setDirection(direction);
		not=new Notify(level,direction , user);
	 }


}
