package univavignon.m1ilsen.aa.sea.elevator.imp;

import univavignon.m1ilsen.aa.sea.sequencer.interface_.Event;

public class EventMove implements Event {

	/**
	 * 
	 */
	public Elevator Elevator;

	/**
	 * Getter of Elevator
	 */
	public Elevator getElevator() {
	 	 return Elevator; 
	}

	/**
	 * Setter of Elevator
	 */
	public void setElevator(Elevator Elevator) { 
		 this.Elevator = Elevator; 
	}

	/**
	 * 
	 * @param t 
	 */
	public void trigger(long t) { 
		// TODO Auto-generated method
	 } 

}
