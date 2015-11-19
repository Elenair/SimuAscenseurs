package univavignon.m1ilsen.aa.sea.ui;

import java.io.File;

public class ElevatorFile {

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
	 */
	public boolean getElevatorFile() { 
		// TODO Auto-generated method
		
		if( this.file.exists() ){
			return true ;
		}
		return false;
	 } 

}
