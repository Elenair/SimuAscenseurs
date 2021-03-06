package univavignon.m1ilsen.aa.sea.flow.imp;

import univavignon.m1ilsen.aa.sea.commontypes.Direction;
import univavignon.m1ilsen.aa.sea.elevatorui.interface_.UIElevatorRequestFactory;
import univavignon.m1ilsen.aa.sea.flow.interface_.IFlow;
import univavignon.m1ilsen.aa.sea.flow.interface_.IUser;
import univavignon.m1ilsen.aa.sea.sequencer.imp.SimulationClock;
import univavignon.m1ilsen.aa.sea.sequencer.interface_.Event;
import univavignon.m1ilsen.aa.sea.sequencer.interface_.Sequencer;

public class DummyFlow implements IFlow, IUser, Event {

	private UIElevatorRequestFactory IERF;
	
	public DummyFlow()
	{
		IERF = new UIElevatorRequestFactory();
		Sequencer.addProcecss(this, 1000);
	}
	
	@Override
	public void notifyCall(long t) {
		System.out.println("notifyCall " + t);
		//IERF.createMove(3,this);
		
	}

	@Override
	public void notifyMove(long t) {
		System.out.println("notifyMove " + t);
		
	}

	@Override
	public void start() {
		Sequencer.create(10000, System.currentTimeMillis(), 1, 1);
		Sequencer.start();
		
	}

	@Override
	public int getMaxLevel() {
		return 5;
		
	}

	@Override
	public void trigger(long t) {
		System.out.println("trigger flow");
		//IERF.createCall(3,Direction.up,this);
		
	}

}
