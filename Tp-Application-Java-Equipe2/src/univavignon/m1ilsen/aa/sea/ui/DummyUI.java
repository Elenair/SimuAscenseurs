package univavignon.m1ilsen.aa.sea.ui;

import java.io.File;

import univavignon.m1ilsen.aa.sea.elevator.interface_.ElevatorFactory;
import univavignon.m1ilsen.aa.sea.flow.interface_.FlowFactory;
import univavignon.m1ilsen.aa.sea.flow.interface_.IFlow;

public class DummyUI {

	private FlowFactory ff;
	private ElevatorFactory ef;
	private String flowSetting;
	
	public DummyUI()
	{
		ff = new FlowFactory();
		ef = new ElevatorFactory();
		flowSetting = "flowSetting";
	}
	
	public static void main(String[] args) {
		DummyUI D = new DummyUI();
		D.ef.buildElevator(new File("setting"));
		IFlow f = D.ff.buildFlow(new File(D.flowSetting));
		f.start();
	}

}
