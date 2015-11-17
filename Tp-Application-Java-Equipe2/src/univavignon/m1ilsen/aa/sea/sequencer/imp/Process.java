package univavignon.m1ilsen.aa.sea.sequencer.imp;

import univavignon.m1ilsen.aa.sea.sequencer.interface_.Event;

public class Process {

	
	/**
	 * 
	 */
	private Event event;
	private long lastCall;
	private long periode;
	
	public Process(Event E, long t)
	{
		event = E;
		periode = t;
		lastCall = 0;
	}
	
	public long getPeriode()
	{
		return periode;
	}

	/**
	 * Getter of event
	 */
	public Event getEvent() {
	 	 return event; 
	}

	/**
	 * Setter of event
	 */
	public void setDisplayEvent(Event E) { 
		 this.event = E; 
	}

	/**
	 * 
	 * @param t 
	 */
	public void Active(long t)
	{ 
		if (t-lastCall > periode)
		{
			event.trigger(t);
			lastCall = t;
		}
	 } 

}
