package univavignon.m1ilsen.aa.sea.ui;

import java.io.File;
import java.util.Scanner;

public class ConfigureElevator {
	public boolean chooseElevatorFile(){
		
		ElevatorFile ElevatorFile = new ElevatorFile();
		boolean done = true;
	
		do{
			
			if( !done ){
				System.out.println("Le fichier ElevatorFile n'existe pas! , veuillez resaisir le nom\n");
			}
			else{
				System.out.println("Precisez le nom(le chemin d'acces inclus) du fichier ElevatorFile:\n");
			}
			
			Scanner s = new Scanner(System.in);
			String ElevatorFileName = s.nextLine();
			File file = new File(  ElevatorFileName ) ;
			ElevatorFile.setFile(file  );
			
			
			done = ElevatorFile.getElevatorFile();
			
			} while (!done);
		
		return done;	
}
	

				

}
	
