package univavignon.m1ilsen.aa.sea.flow.imp;

import univavignon.m1ilsen.aa.sea.flow.interface_.IFlow;
import java.io.File;

public class FlowFactory {

	/**
	 * 
	 * @param flowFile 
	 * @return 
	 */
	public static Flow_System fs;
	
	public static Flow_System buildFlow(File flowFile) { 
	
		if(fs==null)
		{
			fs=new Flow_System();
		}
		
		return fs;
	 } 

}
