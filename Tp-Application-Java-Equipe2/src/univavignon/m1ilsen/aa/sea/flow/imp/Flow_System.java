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
	
	public ArrayList<User> users = new ArrayList<User>();
	//liste des levels 
	public ArrayList level=new ArrayList();
	public ArrayList h_arrive=new ArrayList();
	private ArrayList<IRequest> requestList;
	public static  File fic ;
	Elevator el=new Elevator();
	UIElevatorRequestFactory uiel=new UIElevatorRequestFactory();
	public static FlowFactory ff;


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
        		
        		//liste de tous les levels 
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
		
		Iterator<User> us = this.users.iterator();

		
		while(us.hasNext())
		{  
			User u=us.next();
			if(u.getHeure_arrive()>=t){
			 
				
						 if(u.getDestination()<u.getDepart() && (u.getRequest().getState()==UserState.WAIT)){
							uiel.createCall(u.getDepart(), Direction.down, u);}
						 
						 else if(u.getDestination()>u.getDepart() && (u.getRequest().getState()==UserState.WAIT)){
								uiel.createCall(u.getDepart(), Direction.up, u);}
			
		}
		
		}
	}

	/**
	 * 
	 */
	public void start() { 
		// TODO Auto-generated method
		Sequencer.start();
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
	

	public static File flow_completed(ArrayList<User> us){
		fic=new File("flow_Completed.txt");
		try
		{
		    FileWriter fw = new FileWriter (fic);
		 
		    Iterator<User> itr = us.iterator();
		    
		    while (itr.hasNext()) {
		    	User u=itr.next();
		    	String s = u.getHeure_arrive()+","+u.getHeure_attente()+","+u.getHeure_destination()+","+u.getDepart()+","+u.getDestination();
		        fw.write (s);
		        fw.write ("\r\n");
		    }
		 
		    fw.close();
		}
		catch (IOException exception)
		{
		    System.out.println ("Erreur lors de la lecture : " + exception.getMessage());
		}
		
		return fic;
	}

}
