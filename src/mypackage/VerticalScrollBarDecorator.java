package mypackage;

public class VerticalScrollBarDecorator extends WindowDecorator {

	WindowConcrete window;

	public VerticalScrollBarDecorator(WindowConcrete window) {
		this.window = window;
	}
	
	public String getDescription() {
		return window.getDescription() + ""
				+ "\nWidth: " + window.getWidth() 
				+ "\nHeight: " + window.getHeight() 
				+ "\nwith a Vertical Scroll Bar";
	}

	public void draw() {
		System.out.println("Vertical Scrolling enabled");
	}
	
}
