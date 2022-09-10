package mypackage;

public class SimpleWindow extends WindowConcrete {
	public SimpleWindow() {
		description = "Simple Window";
	}
	
	public void draw() {
		System.out.println("No Scrolling Enabled.");
	}
}
