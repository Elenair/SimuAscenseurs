package univavignon.m1ilsen.aa.sea.flow.imp;

import java.lang.String;

import univavignon.m1ilsen.aa.sea.elevatorui.interface_.IUIrequest;

public class Notify implements IUIrequest {

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
	public void Notify(int etagedemande, String direction, User user) { 
		// TODO Auto-generated method
	 }

	/**
	 * 
	 * @param t 
	 */
	public void notifyStop(long t) { 
		// TODO Auto-generated method
	 } 

}
