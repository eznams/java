package moduleI;

public class Clothes {
	protected String size;
	protected String color;
	
	public Clothes(String size, String color) {
		
		this.size = size;
		this.color = color;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Clothes object - Size: " + size + ", Color: " + color;
	}
}
