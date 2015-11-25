package univavignon.m1ilsen.aa.sea.ui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class FileHandling {

	/**
	 * 
	 */
	public File file;
	public File out ;

	/**
	 * Getter of file
	 */
	public File getFile() {
	 	 return file; 
	}

	/**
	 * Setter of file
	 */
	public void setFile(File file) { 
		 this.file = file; 
	}

	/**
	 * 
	 * @return 
	 * @throws IOException 
	 */
	public Map  read() throws IOException { 
		// TODO Auto-generated method
		
		System.out.println("Reading the flow_completed file");
        FileReader fr = new FileReader( file );
        BufferedReader br = new BufferedReader(fr);
        
        Vector <Long> HEURE_APPEL = new Vector <Long>() ;
        Vector <Integer> DEPART_NIVEAU = new Vector <Integer>() ;
        Vector <Integer> DESTINATION_NIVEAU = new Vector <Integer>() ;
        Vector <Long> HEURE_DEPART  = new Vector <Long>() ;
        Vector <Long> HEURE_ARRIVEE = new Vector <Long>() ;
        
        int indice = 0 ;
        
        for (String line = br.readLine(); line != null; line = br.readLine()) {
        	String[] champs = line.split(",");
        	
        	
        		long heure_appel = Integer.parseInt(champs[0]);
        		long heure_depart = Long.parseLong(champs[1]);
        		long heure_arrivee = Long.parseLong(champs[2]);
        		int depart_niveau = Integer.parseInt(champs[3]);
        		int destination_niveau = Integer.parseInt(champs[4]);
        		
        		HEURE_APPEL.add( indice , heure_appel );
        		DEPART_NIVEAU.add( indice , depart_niveau );
        		DESTINATION_NIVEAU.add( indice , destination_niveau );
        		HEURE_DEPART.add( indice , heure_depart);
        		HEURE_ARRIVEE.add( indice ,heure_arrivee );
        	
        		indice++;
        }
        br.close();
        fr.close();

        Map table = new HashMap<String,Object>();
        
        table.put("heure_appel", HEURE_APPEL );
        table.put("depart_niveau",DEPART_NIVEAU);
        table.put("destination_niveau",DESTINATION_NIVEAU);
        table.put("heure_depart",HEURE_DEPART);
        table.put("heure_arrivee",HEURE_ARRIVEE);
        
        System.out.println("file readed");
        
        
		return table;
	 }

	/**
	 * 
	 * @param table 
	 * @throws IOException 
	 */
	public void write( Map table) throws IOException { 
		// TODO Auto-generated method
		
		  FileWriter fw = new FileWriter( out );
	      BufferedWriter br = new BufferedWriter(fw);
	     
		 br.write("WaitingTimeAverage:" + table.get("WaitingTimeAverage") );
		 br.write("TripTimeAverage:" + table.get("TripTimeAverage") );
		 br.write("TripTimeStandartDeviation:" + table.get("TripTimeStandartDeviation"));
		 br.write("WaitingTimeStandartDeviation : " + table.get("WaitingTimeStandartDeviation"));
		 
		 
	 } 

}