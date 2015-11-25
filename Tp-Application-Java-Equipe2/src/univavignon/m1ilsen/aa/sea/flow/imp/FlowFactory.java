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
	public static Sequencer s;
	
	public static Flow_System buildFlow(File flowFile) { 
	
		
		
		if(fs==null)
		{
			fs=new Flow_System();
			// creat sequencer(durée,origin,contraction,expansion)
			Sequencer.create(System.currentTimeMillis()-fs.getH_arrive(),fs.getH_arrive(),1,1);
			
			Sequencer.addProcecss(fs, 2000);
		}
		
		
		return fs;
	 } 

}
