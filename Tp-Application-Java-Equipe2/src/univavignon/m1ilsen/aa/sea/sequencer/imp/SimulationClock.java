package univavignon.m1ilsen.aa.sea.sequencer.imp;

public class SimulationClock {

	/**
	 * 
	 */
	private static long origin;
	/**
	 * 
	 */
	private static int expansion;
	/**
	 * 
	 */
	private static int contraction;
	/**
	 * 
	 */
	private static long duration;
	/**
	 * Getter of origin
	 */
	public static long getOrigin() {
	 	 return origin; 
	}
	/**
	 * Setter of origin
	 */
	public static void setOrigin(long o) { 
		 origin = o; 
	}
	/**
	 * Getter of expansion
	 */
	public static int getExpansion() {
	 	 return expansion; 
	}
	/**
	 * Setter of expansion
	 */
	public static void setExpansion(int expan) { 
		 expansion = expan; 
	}
	/**
	 * Getter of contraction
	 */
	public static int getContraction() {
	 	 return contraction; 
	}
	/**
	 * Setter of contraction
	 */
	public static void setContraction(int contract) { 
		 contraction = contract; 
	}
	/**
	 * Getter of duration
	 */
	public static long getDuration() {
	 	 return duration; 
	}
	/**
	 * Setter of origin
	 */
	public static void setDuration(long d) { 
		 duration = d; 
	}
	/**
	 * 
	 */
	public static long time()
	{ 
		return SimulationTimeConverter.RealTime2SimulationTime(System.currentTimeMillis()-origin, expansion, contraction);
	} 

}
