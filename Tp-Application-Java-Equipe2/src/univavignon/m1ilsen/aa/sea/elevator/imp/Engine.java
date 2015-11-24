package univavignon.m1ilsen.aa.sea.elevator.imp;

import univavignon.m1ilsen.aa.sea.sequencer.interface_.Event;
import univavignon.m1ilsen.aa.sea.elevator.interface_.IElevatorCommand;
import univavignon.m1ilsen.aa.sea.commontypes.Direction;
import univavignon.m1ilsen.aa.sea.controlsystem.interface_.IElevatorNotifier;

public class Engine{

	
	/**
	 * 
	 */
     double speed = 0.0;
	
	public double getSpeed() {
	 	 return speed; 
	}
	/**
	 * Setter of speed
	 */
	public void setSpeed(double vitesse) { 
		 this.speed = vitesse; 
	}
	/**
	 * 
	 */
	public void runningEng(Direction direction){
		
		if (direction == Direction.up || direction == Direction.down ){
			ChangeSpeed();
		}
		
		if (direction == Direction.none){
			stoppingEng();
		}
	}
	
	public void stoppingEng(){
		speed = 0.0;
	}
	
	public void ChangeSpeed(){
		speed =  10.0; 
		
	}

}
