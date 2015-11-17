package univavignon.m1ilsen.aa.sea.flow.imp;

import univavignon.m1ilsen.aa.sea.flow.interface_.IUser;

public class User implements IUser {

	/**
	 * 
	 */
	
	private int id, depart,destination;
	private long heure_arrive;
	/**
	 * 
	 */
	public UserRequest userRequest;

	/**
	 * 
	 * @param heurarrive 
	 * @param etagearrive 
	 * @param etagedesti 
	 */
	public User(int id,int depart,int destination,long heure_arrive) { 
		// TODO Auto-generated method
		this.id=id;
		this.depart=depart;
		this.destination=destination;
		this.heure_arrive=heure_arrive;
		
	 }

	/**
	 * 
	 * @param t 
	 */
	public void notifyCall(long t) { 
		// TODO Auto-generated method
	 }

	/**
	 * 
	 * @param t 
	 */
	public void notifyMove(long t) { 
		// TODO Auto-generated method
	 }

	/**
	 * Getter of id
	 */
	public int getId() {
	 	 return id; 
	}

	/**
	 * Setter of id
	 */
	public void setId(int id) { 
		 this.id = id; 
	}

	/**
	 * Getter of userRequest
	 */
	public UserRequest getUserRequest() {
	 	 return userRequest; 
	}

	/**
	 * Setter of userRequest
	 */
	public void setUserRequest(UserRequest userRequest) { 
		 this.userRequest = userRequest; 
	} 

}
