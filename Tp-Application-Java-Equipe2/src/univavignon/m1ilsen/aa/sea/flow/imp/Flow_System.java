package univavignon.m1ilsen.aa.sea.flow.imp;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;






public class Flow_System implements Event, IFlow {

	/**
	 * 
	 */
	public liste_User liste_User;
	public ArrayList<User> users = new ArrayList<User>();
	public ArrayList level=new ArrayList();
	public ArrayList h_arrive=new ArrayList();

	/**
	 * Getter of liste_User
	 */
	public liste_User getListe_User() {
	 	 return liste_User; 
	}

	/**
	 * Setter of liste_User
	 */
	public void setListe_User(liste_User liste_User) { 
		 this.liste_User = liste_User; 
	}

	/**
	 * 
	 * @param flowFile 
	 * @throws Exception 
	 */
	public void lire_flow(File flowFile) throws Exception { 
		// TODO Auto-generated method
		
		System.out.println("Chargement du fichier flow");
        FileReader fr = new FileReader(flowFile);
        BufferedReader br = new BufferedReader(fr);
        User u = null;
        
        for (String line = br.readLine(); line != null; line = br.readLine()) {
        	String[] champs = line.split(",");
        	try
        	{
        		int id = Integer.parseInt(champs[0]);
        		
        		//usersTrafic.add(u);
        		
        		int depart = Integer.parseInt(champs[1]);
        		int destination = Integer.parseInt(champs[2]);
        		long heure_arrive = Long.parseLong(champs[3]);
        		//creation d'un utilisateur
        		u = new User(id,depart,destination,heure_arrive);
        		users.add(u);
        		//liste de tous les level 
        		level.add(destination);
        		// liste de tous les heures d'arrivées
        		h_arrive.add(heure_arrive);
        		
        	}catch(ClassCastException e)
        	{
        		System.out.println(e.getMessage());
        	}

        }
        br.close();
        fr.close();

        System.out.println("fichier lu");
	 }

	/**
	 * 
	 * @param flowFile 
	 */
	/*public void afficher(){
  	  System.out.println("Affichage");
    	  for(int j=0;j<users.size();j++){
  
  		         System.out.println(users.get(j).getId());
  		      }
  		  
  	  
    }*/
	public void write_flowcompleted(File flowFile) { 
		// TODO Auto-generated method
	 }

	/**
	 * 
	 * @param t 
	 */
	public  void trigger(long t){
		
		long i=(long)Collections.min(h_arrive);
		if(i>=t){
			
		}
		
	}

	/**
	 * 
	 */
	public void start() { 
		// TODO Auto-generated method
	 }

	/**
	 * 
	 */
	public int getMaxLevel() { 
		// TODO Auto-generated method
		
		return (int)Collections.max(level);

	}
	
	
	public static void main(String[] args) throws Exception {
		Flow_System fs=new Flow_System();
		File f=new File("src/flow");
		fs.lire_flow(f);
		//fs.afficher();
	}

}
