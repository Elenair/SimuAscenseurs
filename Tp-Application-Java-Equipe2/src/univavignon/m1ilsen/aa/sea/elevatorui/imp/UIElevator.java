package univavignon.m1ilsen.aa.sea.elevatorui.imp;

import univavignon.m1ilsen.aa.sea.commontypes.Direction;
import univavignon.m1ilsen.aa.sea.elevator.imp.Elevator;
import univavignon.m1ilsen.aa.sea.flow.imp.Notify;
import univavignon.m1ilsen.aa.sea.flow.imp.User;

public class UIElevator {

	/**
	 * 
	 * @param level 
	 * @param direction 
	 * @param user 
	 */
	CSRequestFactory cs;
	public UIElevator()
	{ 
		cs =new CSRequestFactory();
	}
	
	
	public void add_request(int level, Direction direction, User user) { 
		// TODO Auto-generated method
		Notify not=new Notify(level,direction , user);
		not.setDirection(direction);
		
		cs.stopRequest(level,direction,not);
		
	 }


}
