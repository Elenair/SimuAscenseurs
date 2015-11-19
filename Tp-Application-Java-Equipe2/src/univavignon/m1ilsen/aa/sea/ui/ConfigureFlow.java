package univavignon.m1ilsen.aa.sea.ui;

import java.io.File;
import java.util.Scanner;

import univavignon.m1ilsen.aa.sea.flow.interface_.FlowFactory;
import univavignon.m1ilsen.aa.sea.flow.interface_.IFlow;

public class ConfigureFlow { 
	
	File file ;
	
	public boolean chooseFlowFile(){

		
		FlowFile flowFile = new FlowFile();
		
		boolean done = true ;
		
		do{
			if( !done ){
				System.out.println(" Le fichier n'existe pas veuillez resaisir le nom du fichier des configurations du Flow.");
			}
			else{
				System.out.println(" Veuillez saisir le nom du fichier des configurations du Flow.");
			}
			System.out.println(" Veuillez saisir le nom du fichier des configurations du Flow.");
			Scanner sc = new Scanner(System.in);
			String nameFile = sc.nextLine();
			System.out.println("Vous avez saisi " +  nameFile);
			
			file = new File( nameFile );
			
			done = flowFile.getFlowFile( file );
			
		}while( !done );
		
		return done ;
	}
	
	public IFlow createFlow(){
		
		if( chooseFlowFile() ){
			FlowFactory ffc = new FlowFactory() ;
			return ffc.buildFlow( file );
		}
		
		return null ;
	}

}
