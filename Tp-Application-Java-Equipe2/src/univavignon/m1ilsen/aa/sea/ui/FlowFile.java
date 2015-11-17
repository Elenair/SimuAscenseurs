package univavignon.m1ilsen.aa.sea.ui;

import java.io.File;

public class FlowFile {

	/**
	 * 
	 * @return 
	 */
	public boolean getFlowFile( File file ) { 
		// TODO Auto-generated method
		if( file.exists() ){
			return true ;
		}
		return false;
	 } 

}
