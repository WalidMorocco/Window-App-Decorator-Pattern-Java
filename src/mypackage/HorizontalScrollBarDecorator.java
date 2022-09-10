package mypackage;

public class HorizontalScrollBarDecorator extends WindowDecorator {

	WindowConcrete window;

	public HorizontalScrollBarDecorator(WindowConcrete window) {
		this.window = window;
	}
	
	public String getDescription() {
		return window.getDescription() + ""
				+ "\nWidth: " + window.getWidth() 
				+ "\nHeight: " + window.getHeight() 
				+ "\nwith an Horizontal Scroll Bar";
	}

	public void draw() {
		System.out.println("Horizontal Scrolling enabled");
	}
	
}
