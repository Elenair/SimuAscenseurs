package univavignon.m1ilsen.aa.sea.ui;

import java.io.File;
import java.util.Scanner;

import univavignon.m1ilsen.aa.sea.elevator.interface_.ElevatorFactory;

public class ConfigureElevator {
	

	File file;
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
			done = ElevatorFile.getElevatorFile();
			} while (!done);
		
		return done;	
}

	public int createElevator(){
		if(  chooseElevatorFile() ){
			ElevatorFactory elf = new  ElevatorFactory();
			return elf.buildElevator(file);
			}
		return -1 ;
	}

				

}
	
