package univavignon.m1ilsen.aa.sea.flow.imp;

import java.lang.String;

import univavignon.m1ilsen.aa.sea.commontypes.Direction;
import univavignon.m1ilsen.aa.sea.commontypes.ElevatorState;
import univavignon.m1ilsen.aa.sea.elevator.imp.Elevator;
import univavignon.m1ilsen.aa.sea.elevatorui.interface_.IUIrequest;
import univavignon.m1ilsen.aa.sea.flow.interface_.IRequest;

public class Notify implements IUIrequest {

	public Direction direction;
	
	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	/**
	 * 
	 */
	public User user;
	/**
	 * Getter of user
	 */
	public User getUser() {
	 	 return user; 
	}

	/**
	 * Setter of user
	 */
	public void setUser(User user) { 
		 this.user = user; 
	}

	/**
	 * 
	 * @param etagedemande 
	 * @param direction 
	 * @param user 
	 */
	public  Notify(int etagedemande, Direction direction, User user) { 
		// TODO Auto-generated method
		
	 }

	/**
	 * 
	 * @param t 
	 */
	public void notifyStop(long t) { 
		// TODO Auto-generated method
		
		
		if(this.direction!=Direction.none)
		{
			user.notifyCall(t);
		}
		else
			user.notifyMove(t);

	 } 

}
