package moduleI;

public class pants extends Clothes {
	private int numberOfPockets;
	private String beltLoopsColor;
	
	
	public pants(String size, String color, int numberOfPockets, String beltLoopsColor) {
		super(size, color);
		this.numberOfPockets = numberOfPockets;
		this.beltLoopsColor = beltLoopsColor;
	}
	public int getNumberOfPockets() {
		return numberOfPockets;
	}
	public void setNumberOfPockets(int numberOfPockets) {
		this.numberOfPockets = numberOfPockets;
	}
	public String getBeltLoops() {
		return beltLoopsColor;
	}
	public void setBeltLoops(String beltLoops) {
		this.beltLoopsColor = beltLoops;
	}
	@Override
	public String toString() {
		String a = "Pants object - " + super.toString() + ", color of belt loops: " + beltLoopsColor + ", number of pockets: " +numberOfPockets ;
		return a;
	}
}
