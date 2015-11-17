package univavignon.m1ilsen.aa.sea.controlsystem.imp;

import java.util.ArrayList;

import univavignon.m1ilsen.aa.sea.commontypes.Direction;
import univavignon.m1ilsen.aa.sea.commontypes.ElevatorState;
import univavignon.m1ilsen.aa.sea.controlsystem.interface_.IElevatorNotifier;
import univavignon.m1ilsen.aa.sea.elevator.interface_.ElevatorCommandFactory;
import univavignon.m1ilsen.aa.sea.elevator.interface_.IElevatorCommand;
import univavignon.m1ilsen.aa.sea.elevatorui.interface_.IUIrequest;

public class DummyControlSystem implements IElevatorNotifier{

	private ArrayList<ArrayList<Object>> requestList = new ArrayList<ArrayList<Object>>();
	private IElevatorCommand IEC;
	
	public DummyControlSystem() {
		IEC = ElevatorCommandFactory.getElevatorCommand(this);
	}
	
	@Override
	public void notifyLevel(int level, long t) {
		System.out.println("notifyLevel " + level);
		if (!requestList.isEmpty() && level == (int)requestList.get(0).get(0))
		{
			IEC.stopAtLevel();
		}
		
	}

	@Override
	public void notifyState(ElevatorState elevatorState, long t) {
		System.out.println("notifyState " + elevatorState);
		if (elevatorState == ElevatorState.closed)
		{
			final IUIrequest request = (IUIrequest) requestList.get(0).get(2) ;
			request.notifyStop(t);
		}
		
	}
	
	public void addRequest(int level, Direction direction, IUIrequest request)
	{
		ArrayList<Object> L = new ArrayList<>();
		L.add(level);
		L.add(direction);
		L.add(request);
		requestList.add(L);
		IEC.move(Direction.up);
	}

	@Override
	public void notifyLevel(int level) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyState(ElevatorState elevatorState) {
		// TODO Auto-generated method stub
		
	}

}
