package univavignon.m1ilsen.aa.sea.ui;

public class SimulatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConfigureElevator ce = new ConfigureElevator();
		
		if( ce.chooseElevatorFile() ){
			System.out.println(" ça marche ");
		}
		else System.out.println("ça ne marche pas");
		
		

	}

}

