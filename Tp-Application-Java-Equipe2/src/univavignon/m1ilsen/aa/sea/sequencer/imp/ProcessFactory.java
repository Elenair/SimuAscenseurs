package univavignon.m1ilsen.aa.sea.sequencer.imp;

import univavignon.m1ilsen.aa.sea.sequencer.interface_.Event;

public class ProcessFactory {

	/**
	 * 
	 * @param T 
	 * @param E 
	 */
	public static void createProcess(long t, Event E)
	{ 
		Process P = new Process(E,t);
		ProcessExecutor.addProcess(P);
	} 

}
