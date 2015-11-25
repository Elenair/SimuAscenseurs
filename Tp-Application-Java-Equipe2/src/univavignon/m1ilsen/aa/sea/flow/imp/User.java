package univavignon.m1ilsen.aa.sea.flow.imp;

import java.text.SimpleDateFormat;
import java.util.Date;

import univavignon.m1ilsen.aa.sea.commontypes.UserState;
import univavignon.m1ilsen.aa.sea.elevator.imp.Elevator;
import univavignon.m1ilsen.aa.sea.elevatorui.interface_.UIElevatorRequestFactory;
import univavignon.m1ilsen.aa.sea.flow.interface_.IRequest;
import univavignon.m1ilsen.aa.sea.flow.interface_.IUser;

public class User implements IUser,IRequest {

	/**
	 * 
	 */
	
	private int id, depart,destination;
	private long heure_arrive,heure_attente,heure_destination;
	
	private UserState state;
	private UIElevatorRequestFactory IEF;
	private IRequest Request;
	private Elevator el;
	private Notify not;

    public UserState getState() {
		return state;
	}

	/**
	 * 
	 */
	public UserRequest userRequest;

	public long getHeure_attente() {
		return heure_attente;
	}

	public void setHeure_attente(long heure_attente) {
		this.heure_attente = heure_attente;
	}

	public int getDepart() {
		return depart;
	}

	public void setDepart(int depart) {
		this.depart = depart;
	}

	public int getDestination() {
		return destination;
	}

	public void setDestination(int destination) {
		this.destination = destination;
	}

	public long getHeure_arrive() {
		return heure_arrive;
	}

	public void setHeure_arrive(long heure_arrive) {
		this.heure_arrive = heure_arrive;
	}
	
	public void setState(UserState state) {
		
		this.state = state;
	}

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
		this.state = UserState.WAIT;
		heure_attente=getHeure_attente();
		heure_destination=getHeure_destination();
		
	 }

	/**
	 * 
	 * @param t 
	 */
	public void notifyCall(long t) { 
		// TODO Auto-generated method
		
		Request.getRequest().setState(UserState.IN);
		
		//calcule le temps d'attente 
		long hr_attente=t;
		
		setHeure_attente(hr_attente);
		System.out.println("L'utilisateur est dans l'ascenseur " );
		IEF.createMove(this.getDestination(), this);
		//return heure_attente;
	 }

	/**
	 * 
	 * @param t 
	 */
	public void notifyMove(long t) { 
		// TODO Auto-generated method

		Request.getRequest().setState(UserState.SERVED);
		System.out.println("L'utilisateur  est servi");
		setHeure_destination(t);
		
	 }

	public long getHeure_destination() {
		return heure_destination;
	}

	public void setHeure_destination(long heure_destination) {
		this.heure_destination = heure_destination;
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

	@Override
	public User getRequest() {
		// TODO Auto-generated method stub
		return this;
	} 


}
