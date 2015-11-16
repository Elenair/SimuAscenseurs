package univavignon.m1ilsen.aa.sea.sequencer.imp;

public class Timer {

	/**
	 * 
	 * @param T 
	 */
	public static void sleep(long t)
	{
		long x = SimulationTimeConverter.SimulationTime2RealTime(t, SimulationClock.getExpansion(), SimulationClock.getContraction());
		try {
			Thread.sleep(x);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	} 

}
