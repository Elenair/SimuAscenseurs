package univavignon.m1ilsen.aa.sea.elevator.imp;

import univavignon.m1ilsen.aa.sea.sequencer.interface_.Event;
import univavignon.m1ilsen.aa.sea.sequencer.interface_.Sequencer;
import univavignon.m1ilsen.aa.sea.elevator.interface_.IElevatorCommand;
import univavignon.m1ilsen.aa.sea.commontypes.Direction;
import univavignon.m1ilsen.aa.sea.commontypes.ElevatorState;
import univavignon.m1ilsen.aa.sea.controlsystem.interface_.IElevatorNotifier;

public class DummyElevator implements Event, IElevatorCommand {
	
	/**
	 * 
	 */
	private IElevatorNotifier iElevatorNotifier;
	private ElevatorState state;
	private int level = 0;
	
	public DummyElevator()
	{
		Sequencer.addProcecss(this, 500);
	}

	/**
	 * Getter of iElevatorNotifier
	 */
	public IElevatorNotifier getIElevatorNotifier() {
	 	 return iElevatorNotifier; 
	}

	/**
	 * Setter of iElevatorNotifier
	 */
	public void setIElevatorNotifier(IElevatorNotifier iElevatorNotifier) { 
		 this.iElevatorNotifier = iElevatorNotifier; 
	}

	/**
	 * 
	 */
	public void stopAtLevel() { 
		state = ElevatorState.open;
		state = ElevatorState.closed;
	 }

	@Override
	public void move(Direction direction) {
		state = ElevatorState.moving;
		
	}

	@Override
	public void trigger(long t) {
		System.out.println("trigger elevator");
		iElevatorNotifier.notifyState(state, t);
		iElevatorNotifier.notifyLevel(level, t);
		if (state == ElevatorState.open)
		{
			
		}
		else if (state == ElevatorState.moving)
		{
			level++;
		}
		
	} 

}
