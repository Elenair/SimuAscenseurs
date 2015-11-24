package univavignon.m1ilsen.aa.sea.elevator.imp;

public class Sensor {

	/**
	 *  teste si le capteur est coupé ou pas
	 */
	 boolean cross=false ;
	/**
	 * identifiant du capteur
	 */
	 int id_sensor;
	/**
	 * Getter of cross 
	 */
	public boolean getCross () {
	 	 return cross ; 
	}
	/**
	 * Setter of cross 
	 */
	public void setCross (boolean cross ) { 
		 this.cross  = cross ; 
	}
	/**
	 * Getter of id_sensor
	 */
	public int getId_sensor() {
	 	 return id_sensor; 
	}
	/**
	 * Setter of id_sensor
	 */
	public void setId_sensor(int id_sensor) { 
		 this.id_sensor = id_sensor; 
	}
	/**
	 * 
	 */
	public void detection () { 
		// TODO Auto-generated method
		
		cross = true;
	 } 

}
