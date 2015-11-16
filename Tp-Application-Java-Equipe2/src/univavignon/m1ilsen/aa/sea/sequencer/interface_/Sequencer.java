package univavignon.m1ilsen.aa.sea.sequencer.interface_;

import univavignon.m1ilsen.aa.sea.sequencer.imp.ProcessExecutor;
import univavignon.m1ilsen.aa.sea.sequencer.imp.ProcessFactory;
import univavignon.m1ilsen.aa.sea.sequencer.imp.SimulationClock;
import univavignon.m1ilsen.aa.sea.sequencer.imp.SimulationTimeConverter;

public class Sequencer {

	/**
	 * 
	 * @param duration 
	 * @param origin 
	 * @param contraction 
	 * @param expansion 
	 */
	public static void create(long duration, long origin, int contraction, int expansion) { 
		SimulationClock.setOrigin(origin);
		SimulationClock.setContraction(contraction);
		SimulationClock.setExpansion(expansion);
		SimulationClock.setDuration(SimulationTimeConverter.RealTime2SimulationTime(duration, expansion, contraction));
	 }

	/**
	 * 
	 * @param process 
	 * @param periode 
	 */
	public static void addProcecss(Event process, long periode) { 
		ProcessFactory.createProcess(periode, process);
	 }

	/**
	 * 
	 */
	public static void start() { 
		ProcessExecutor.initialise();
		ProcessExecutor.sequence();
	 } 

}
