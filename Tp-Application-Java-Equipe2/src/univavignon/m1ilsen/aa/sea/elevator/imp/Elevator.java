package univavignon.m1ilsen.aa.sea.elevator.imp;

import univavignon.m1ilsen.aa.sea.elevator.interface_.IElevatorCommand;
import univavignon.m1ilsen.aa.sea.commontypes.ElevatorState;
import univavignon.m1ilsen.aa.sea.commontypes.Direction;

public class Elevator  {

	/**
	 * 
	 */
	 private long time_open;
	 private long time_close;
	 private long time_wait;
	 private long time_sum_trig_open;
	 private long time_sum_trig_close;
	 private long time_sum_trig_wait;
	 
	
	 ElevatorState state;
	/**
	 * 
	 */
	public int position;
	
	/**
	 * 
	 */
	public Direction direction;
	/**
	 * Getter of state
	 */
	public Elevator(long closetime,long opentime, long waitime){
		time_open = closetime;
		time_close = opentime;
		time_wait = waitime;
	}

	public ElevatorState getState() {
	 	 return state; 
	}
	/**
	 * Setter of state
	 */
	public void setState(ElevatorState state) { 
		 this.state = state; 
	}
	/**
	 * Getter of position
	 */
	public int getPosition() {
	 	 return position; 
	}
	/**
	 * Setter of position
	 */
	public void setPosition(int position) { 
		 this.position = position; 
	}
	/**
	 * Getter of direction
	 */
	public Direction getDirection() {
	 	 return direction; 
	}
	/**
	 * Setter of direction
	 */
	public void setDirection(Direction direction) { 
		 this.direction = direction; 
	}
	/**
	 * 
	 * @param speed  
	 * @throws InterruptedException 
	 */
	
	


	public void Openning(long t) 
	{ 
	
		// TODO Auto-generated method
		time_sum_trig_open += t;
		if(time_sum_trig_open >= time_open){
			state = ElevatorState.open;
			
		}
		
	 }
	/**
	 * @throws InterruptedException 
	 * 
	 */
	public void closeDoor(long t) { 
		// TODO Auto-generated method
		
		time_sum_trig_close += t;
		if(time_sum_trig_close >= time_close){
			state = ElevatorState.closed;
		}
	 }
	public void waiting(long t){
		time_sum_trig_wait += t;
		time_wait -= ((time_sum_trig_close - time_close) + (time_sum_trig_open - time_open));
		if(time_sum_trig_wait >= time_wait){
			state = ElevatorState.waiting;
		}
	}
	/**
	 * 
	 */
	public long computeTime(long t) { 
		// TODO Auto-generated method
		return (time_wait + time_close + time_open);
	 }
	
	

}
