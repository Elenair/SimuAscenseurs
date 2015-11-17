package univavignon.m1ilsen.aa.sea.controlsystem.interface_;

import univavignon.m1ilsen.aa.sea.controlsystem.imp.DummyControlSystem;
import univavignon.m1ilsen.aa.sea.commontypes.Direction;
import univavignon.m1ilsen.aa.sea.elevatorui.interface_.IUIrequest;

public class CSRequestFactory {

	/**
	 * 
	 */
	public DummyControlSystem dummyControlSystem;
	
	public CSRequestFactory()
	{
		dummyControlSystem = new DummyControlSystem();
	}

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
	 * @param UIrequest 
	 */
	public void stopRequest(int level, Direction direction, IUIrequest UIrequest) { 
		dummyControlSystem.addRequest(level, direction, UIrequest);
	 } 

}
