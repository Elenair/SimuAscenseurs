package univavignon.m1ilsen.aa.sea.elevatorui.imp;

import univavignon.m1ilsen.aa.sea.controlsystem.imp.DummyControlSystem;
import univavignon.m1ilsen.aa.sea.commontypes.Direction;
import univavignon.m1ilsen.aa.sea.flow.imp.Notify;

public class CSRequestFactory {

	/**
	 * 
	 */
	public DummyControlSystem dummyControlSystem;

	/**
	 * Getter of dummyControlSystem
	 */
	public DummyControlSystem getDummyControlSystem() {
	 	 return dummyControlSystem; 
	}

	/**
	 * Setter of dummyControlSystem
	 */
	public void setDummyControlSystem(DummyControlSystem dummyControlSystem) { 
		 this.dummyControlSystem = dummyControlSystem; 
	}

	/**
	 * 
	 * @param level 
	 * @param direction 
	 * @param notify 
	 */
	public void stopRequest(int level, Direction direction, Notify notify) { 
		// TODO Auto-generated method
	 } 

}
