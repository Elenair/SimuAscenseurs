package univavignon.m1ilsen.aa.sea.sequencer.imp;

public class SimulationTimeConverter {

	/**
	 * 
	 * @param t 
	 */
	public static long SimulationTime2RealTime(long t, int expansion, int contraction)
	{ 
		return (t*contraction)/expansion;
	}

	/**
	 * 
	 * @param t 
	 */
	public static long RealTime2SimulationTime(long t, int expansion, int contraction)
	{ 
		return (t*expansion)/contraction;
	} 

}
