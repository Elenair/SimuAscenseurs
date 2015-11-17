package univavignon.m1ilsen.aa.sea.ui;

import java.io.File;
import java.util.Scanner;

public class ConfigureElevator {
	
	File file ;
	
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
			file = new File(  ElevatorFileName ) ;

			done = ElevatorFile.getElevatorFile( file );
			
			} while (!done);
		
		return done;	
}
	
class int createElevator()
{
	
	if (chooseElevatorFile()) {
		return buildElevator( file );
	}
}
				

}
	
