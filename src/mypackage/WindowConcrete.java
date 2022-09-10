package mypackage;

public abstract class WindowConcrete implements Window {

	String description = "Unknown";
	int height = 600;
	int width = 600;


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public abstract void draw();
}
