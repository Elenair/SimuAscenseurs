package univavignon.m1ilsen.aa.sea.flow.imp;

import univavignon.m1ilsen.aa.sea.commontypes.Direction;
import univavignon.m1ilsen.aa.sea.elevatorui.interface_.IUIrequest;
import univavignon.m1ilsen.aa.sea.flow.interface_.IUser;

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
	public IUser user;
	/**
	 * Getter of user
	 */
	public IUser getUser() {
	 	 return user; 
	}

	/**
	 * Setter of user
	 */
	public void setUser(IUser user) { 
		 this.user = user; 
	}

	/**
	 * 
	 * @param etagedemande 
	 * @param direction 
	 * @param user 
	 */
	public  Notify(int etagedemande, Direction direction, IUser user) { 
		// TODO Auto-generated method
		
	 }

	/**
	 * 
	 * @param t 
	 */
	public void notifyStop(long t) { 
		// TODO Auto-generated method
		direction=getDirection();
		
		if(direction!=Direction.none)
		{
			user.notifyCall(t);
		}
		else
			user.notifyMove(t);

	 } 

}
