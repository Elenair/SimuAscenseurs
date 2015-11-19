package univavignon.m1ilsen.aa.sea.flow.imp;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;

import univavignon.m1ilsen.aa.sea.commontypes.Direction;
import univavignon.m1ilsen.aa.sea.commontypes.UserState;
import univavignon.m1ilsen.aa.sea.elevator.imp.Elevator;
import univavignon.m1ilsen.aa.sea.elevatorui.interface_.UIElevatorRequestFactory;
import univavignon.m1ilsen.aa.sea.flow.interface_.IRequest;
import univavignon.m1ilsen.aa.sea.sequencer.interface_.Sequencer;
import univavignon.m1ilsen.aa.sea.sequencer.interface_.Event;

public class Flow_System implements Event, IFlow {

	/**
	 * 
	 */
	public liste_User liste_User;
	public ArrayList<User> users = new ArrayList<User>();
	public ArrayList level=new ArrayList();
	public ArrayList h_arrive=new ArrayList();
	private ArrayList<IRequest> requestList;
	private Sequencer seq;
	Elevator el=new Elevator();
	UIElevatorRequestFactory uiel=new UIElevatorRequestFactory();

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
        		int etage_depart = Integer.parseInt(champs[1]);
        		int destination = Integer.parseInt(champs[2]);
        		long heure_arrive = Long.parseLong(champs[3]);
        		
        		//creation d'un utilisateur
        		u = new User(id,etage_depart,destination,heure_arrive);
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
		Sequencer s=new Sequencer();
		long i=(long)Collections.min(h_arrive);
		
		if(i>=t){
			s.start();
			
		}
		SimpleDateFormat parser = new SimpleDateFormat("HH:mm:ss");
		Date current = new Date(System.currentTimeMillis());
		String scurrent=parser.format(current);
		Iterator<User> us = this.users.iterator();
		
		requestList=new ArrayList<IRequest>();
		
		while(us.hasNext())
		{  
			User u=us.next();
			
				
			Date dcall=new Date(u.getHeure_arrive());
			String scall=parser.format(dcall);
			
			if(scall.compareTo(scurrent)==0)
			{
			 for(IRequest request:requestList)
				{
				 if(u.getDestination()<u.getDepart() && (request.getRequest().getState()==UserState.WAIT)){
					uiel.createCall(el.getPosition(), Direction.down, u);
					
				}
				else if(u.getDestination()>u.getDepart() && (request.getRequest().getState()==UserState.WAIT)){
					uiel.createMove(u.getDestination(), u);
			}
				}
			}
		}
		seq.addProcecss((Event)this, t);
		
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
	public long getH_arrive()
	{
		return (long)Collections.min(h_arrive);
	}
	
	
	public static void main(String[] args) throws Exception {
		Flow_System fs=new Flow_System();
		File f=new File("src/flow");
		fs.lire_flow(f);
		//fs.afficher();
	}

}
