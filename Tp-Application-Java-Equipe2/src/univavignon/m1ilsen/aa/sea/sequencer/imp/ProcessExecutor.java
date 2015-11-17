package univavignon.m1ilsen.aa.sea.sequencer.imp;

import java.util.ArrayList;

public class ProcessExecutor {

	/**
	 * 
	 */
	private static ArrayList<Process> process = new ArrayList<Process>();
	
	/**
	 * 
	 */
	private static long periode;

	/**
	 * 
	 */
	public static void initialise()
	{ 
		long t = SimulationClock.time();
		for (int i = 0 ; i < process.size(); i++)
		{
			process.get(i).getEvent().trigger(t);
		}
	}

	/**
	 * 
	 */
	public static void sequence()
	{ 
		long duration = SimulationClock.getDuration();
		long t;
		
		while ((t = SimulationClock.time()) < duration)
		{
			for (int i = 0 ; i < process.size(); i++)
			{
				process.get(i).Active(t);
			}
			Timer.sleep(periode);
		}
	}

	/**
	 * 
	 * @param p
	 */
	public static void addProcess(Process p)
	{ 
		process.add(p);
		long periodeP = p.getPeriode();
		if (periodeP < periode || periode == 0) { periode = periodeP; }
	} 

}
