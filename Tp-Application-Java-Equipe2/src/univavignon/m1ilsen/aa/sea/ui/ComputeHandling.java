package univavignon.m1ilsen.aa.sea.ui;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class ComputeHandling {

	/**
	 * 
	 */
	
	public Map<String, Object> table;
	/**
	 * 
	 */
	public Compute compute;
	/**
	 * Getter of table
	 */
	public Map getTable() {
	 	 return table; 
	}
	/**
	 * Setter of table
	 */
	public void setTable( Map<String, Object> table) { 
		 this.table = table; 
	}
	/**
	 * Getter of compute
	 */
	public Compute getCompute() {
	 	 return compute; 
	}
	/**
	 * Setter of compute
	 */
	public void setCompute(Compute compute) { 
		 this.compute = compute; 
	}
	/**
	 * 
	 * @param table 
	 */
	public void compute() { 
		// TODO Auto-generated method
		
		 
		 this.table = new HashMap<String, Object>();
		 table.put("WaitingTimeAverage" ,  9);
		 table.put("TripTimeAverage", new Vector<Long>() );
		 table.put("TripTimeStandartDeviation",1);
		 table.put("WaitingTimeStandartDeviation",1);
		 
	 } 

}