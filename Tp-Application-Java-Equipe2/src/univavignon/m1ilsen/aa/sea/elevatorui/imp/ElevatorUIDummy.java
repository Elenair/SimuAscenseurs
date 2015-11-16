package univavignon.m1ilsen.aa.sea.elevatorui.imp;

import univavignon.m1ilsen.aa.sea.commontypes.Direction;
import univavignon.m1ilsen.aa.sea.controlsystem.interface_.CSRequestFactory;
import univavignon.m1ilsen.aa.sea.elevatorui.interface_.IUIrequest;
import univavignon.m1ilsen.aa.sea.flow.interface_.IUser;

public class ElevatorUIDummy implements IUIrequest{

	private CSRequestFactory CSRF;
	private int level;
	private Direction direction;
	private IUser user;
	
	public ElevatorUIDummy(int level, Direction direction, IUser user) {
		CSRF = new CSRequestFactory();
		this.level = level;
		this.direction = direction;
		this.user = user;
	}
	
	@Override
	public void notifyStop(long t) {
		if (direction != Direction.none) { user.notifyCall(t); }
		else { user.notifyMove(t); }
		
	}
	
	public void addCall(int level, Direction direction, IUser user)
	{
		this.level = level;
		this.direction = direction;
		this.user = user;
		CSRF.stopRequest(level, direction, this);
	}
	
	public void addMove(int level, IUser user)
	{
		this.level = level;
		this.user = user;
		CSRF.stopRequest(level, direction, this);
	}

}
