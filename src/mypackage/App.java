package mypackage;

public class App {

	public static void main(String[] args) {
		
		WindowConcrete window1 = new SimpleWindow();
		WindowConcrete window2 = new SimpleWindow();
		System.out.println("Window 1: " + window1.getDescription() + "\n	");
		System.out.println("Window 2: " + window2.getDescription() + "\n	");
		
		System.out.println("\nConfiguring window 1: ");
		
		window1.setHeight(1080);
		window1.setWidth(1920);
		window1 = new VerticalScrollBarDecorator(window1);
		window1.draw();
		
		System.out.println(window1.getDescription());
		
		System.out.println("\nConfiguring window 2: ");

		window2.setHeight(1080);
		window2.setWidth(1920);
		window2 = new HorizontalScrollBarDecorator(window2);
		window2.draw();
				
		System.out.println(window2.getDescription());
	}

}
