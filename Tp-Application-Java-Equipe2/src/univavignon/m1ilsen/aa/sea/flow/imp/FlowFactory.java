package univavignon.m1ilsen.aa.sea.flow.imp;

import univavignon.m1ilsen.aa.sea.flow.interface_.IFlow;
import univavignon.m1ilsen.aa.sea.sequencer.interface_.Sequencer;

import java.io.File;

public class FlowFactory {

	/**
	 * 
	 * @param flowFile 
	 * @return 
	 */
	public static Flow_System fs;
	
	public static Flow_System buildFlow(File flowFile) { 
	
		Sequencer s=new Sequencer();
		
		if(fs==null)
		{
			fs=new Flow_System();
			// creat sequencer
			s.create(System.currentTimeMillis()-fs.getH_arrive(),fs.getH_arrive(),1,1);
		}
		
		
		return fs;
	 } 

}
