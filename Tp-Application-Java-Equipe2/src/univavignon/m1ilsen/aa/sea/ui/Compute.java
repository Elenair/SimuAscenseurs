package univavignon.m1ilsen.aa.sea.ui;

import java.util.Map;
import java.util.Vector;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Compute {

	/**
	 * 
	 * @return 
	 */
	
	Map simulation_map; // results
	
	public void set_simulation_map( Map map ){
		this.simulation_map = map;
			}
	
	
	
	// temps d'un voyage 
	
	public Vector <Long> TripTime( ) { 
		// TODO Auto-generated method
		Vector<Long> hd = (Vector) this.simulation_map.get("heure_depart");
		Vector<Long> ha = (Vector) this.simulation_map.get("heure_arrivee");		
		
		int size = hd.size();
		Vector result = new Vector <Long> ();
		
		for( int i=0 ; i < size ; i++ ){
			long diff = (Long)ha.get(i)-hd.get(i) ;
			result.add( i , diff ); 
		}
		
		return result;
	}
	
	
	// temps moyen des voyages 
	
		public Long AverageTripTime( ) { 
			// TODO Auto-generated method	
			Vector result = new Vector <Long> ();
			result = TripTime();
			long somme = 0;
			for( int i=0 ; i < result.size() ; i++ ){
				somme = (Long)result.get(i) + somme ;
							}
			return somme/result.size();
		}
	
		
	// la durée maximale d'un voyage
		
		

}
