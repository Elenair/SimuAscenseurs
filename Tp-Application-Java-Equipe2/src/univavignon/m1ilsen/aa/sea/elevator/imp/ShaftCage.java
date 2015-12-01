package univavignon.m1ilsen.aa.sea.elevator.imp;

import univavignon.m1ilsen.aa.sea.commontypes.Direction;
import univavignon.m1ilsen.aa.sea.commontypes.ElevatorState;
import univavignon.m1ilsen.aa.sea.controlsystem.interface_.IElevatorNotifier;
import univavignon.m1ilsen.aa.sea.elevator.interface_.IElevatorCommand;
import univavignon.m1ilsen.aa.sea.sequencer.interface_.Event;

public class ShaftCage implements Event,IElevatorCommand {

	private IElevatorNotifier iElevatorNotifier;
	
	private double heightShaftCage;
	private double heightBetween2Level;
	private Engine engine;
	private Elevator elevator;
	private int Nblevel;
	private long lasttrigger;
	private Direction direction;
	private double movingheight;
	private Sensor sensor;
	
	 public ShaftCage(double h0,double h1,int Nblevel,double speed, long closetime, long opentime, long waitime)
	 {
		 this.heightShaftCage = h0;
		 this.heightBetween2Level = h1;
		 this.Nblevel = Nblevel;
		 this.engine = new Engine(speed);
		 this.elevator = new Elevator(closetime,opentime,waitime);
		 this.movingheight = 0.0;
		 }
	
	public void stopAtLevel() 
	{
		// TODO Auto-generated method stub
		
		this.elevator.state = ElevatorState.stopping;
		
	}

	@Override
	public void move(Direction direction) {
		// TODO Auto-generated method stub
		this.direction = direction;
		this.elevator.state = ElevatorState.moving;
	}
	
	/**
	 * Setter of iElevatorNotifier
	 */
	public void setIElevatorNotifier(IElevatorNotifier iElevatorNotifier) { 
		 this.iElevatorNotifier = iElevatorNotifier; 
	}


	@Override
	public void trigger(long t) {
		
		// TODO Auto-generated method stub
		int level = 0 ;long tbst;
		tbst = t - lasttrigger;
		lasttrigger = t;
		
		if(this.elevator.state == ElevatorState.moving){
			if(this.elevator.state == ElevatorState.closed){
			engine.runningEng(direction);
		    	if(direction == direction.up){
				
			    	movingheight += this.engine.getSpeed() * tbst;
			    	level = (int)(movingheight /heightBetween2Level);
				
		    	}else if(direction == direction.down){
				
				    movingheight -= this.engine.getSpeed() * tbst;
				    level = (int)(movingheight /heightBetween2Level);
			}
			
			if(movingheight % heightBetween2Level == 0){
				sensor.detection();
				iElevatorNotifier.notifyLevel(level, lasttrigger);
			}
				sensor.sensorNoCross();
		   }
		}
		
		else if(this.elevator.state == ElevatorState.stopping || this.elevator.state == ElevatorState.closed){
			engine.offEng();
			this.elevator.state = ElevatorState.closed;
			if(this.elevator.state == ElevatorState.closed){
				elevator.Openning(lasttrigger);
			}
		}else if (this.elevator.state == ElevatorState.open){
				elevator.waiting(lasttrigger);
			}else if(this.elevator.state == ElevatorState.waiting){
				elevator.closeDoor(lasttrigger);
				iElevatorNotifier.notifyState(this.elevator.state, lasttrigger);
			}
			
		
			
	}
}
