package univavignon.m1ilsen.aa.sea.flow.interface_;

import java.io.File;

import univavignon.m1ilsen.aa.sea.flow.imp.DummyFlow;

public class FlowFactory {

	/**
	 * 
	 * @param flowFile 
	 * @return 
	 */
	public IFlow buildFlow(File flowFile) { 
		DummyFlow df = new DummyFlow();
		return df;
	 } 

}
