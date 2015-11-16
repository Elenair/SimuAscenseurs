package univavignon.m1ilsen.aa.sea.ui;

import java.io.File;
import java.util.Scanner;

public class ConfigureFlow { 
	
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
			
			File file = new File( nameFile );
			
			flowFile.setFile( file );
			
			done = flowFile.getFlowFile();
			
		}while( !done );
		
		return done ;
	}

}
