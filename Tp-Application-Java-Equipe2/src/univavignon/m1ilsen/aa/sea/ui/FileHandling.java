package univavignon.m1ilsen.aa.sea.ui;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class FileHandling {

	/**
	 * 
	 */
	public File file;

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
		
		System.out.println("Chargement du fichier flow");
        FileReader fr = new FileReader( file );
        BufferedReader br = new BufferedReader(fr);
        
        Vector <Integer> ID = new Vector <Integer>() ;
        Vector <Integer> DEPART_NIVEAU = new Vector <Integer>() ;
        Vector <Integer> DESTINATION_NIVEAU = new Vector <Integer>() ;
        Vector <Long> HEURE_DEPART  = new Vector <Long>() ;
        Vector <Long> HEURE_ARRIVEE = new Vector <Long>() ;
        
        int indice = 0 ;
        
        for (String line = br.readLine(); line != null; line = br.readLine()) {
        	String[] champs = line.split(",");
        	
        	
        		int id = Integer.parseInt(champs[0]);
           		int depart_niveau = Integer.parseInt(champs[1]);
        		int destination_niveau = Integer.parseInt(champs[2]);
        		long heure_depart = Long.parseLong(champs[3]);
        		long heure_arrivee = Long.parseLong(champs[3]);
        		
        		ID.add( indice , id );
        		DEPART_NIVEAU.add( indice , depart_niveau );
        		DESTINATION_NIVEAU.add( indice , destination_niveau );
        		HEURE_DEPART.add( indice , heure_depart);
        		HEURE_ARRIVEE.add( indice ,heure_arrivee );
        	
        		indice++;
        }
        br.close();
        fr.close();

        Map table = new Hashtable();
        
        table.put("id",ID);
        table.put("depart_niveau",DEPART_NIVEAU);
        table.put("destination_niveau",DESTINATION_NIVEAU);
        table.put("heure_depart",HEURE_DEPART);
        table.put("heure_arrivee",HEURE_ARRIVEE);
        
        System.out.println("fichier lu");
        
        
		return table;
	 }

	/**
	 * 
	 * @param table 
	 */
	public void write(float table) { 
		// TODO Auto-generated method
	 } 

}
