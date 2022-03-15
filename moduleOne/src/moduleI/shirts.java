package moduleI;

public class shirts extends Clothes {
	private int numberOfButtons;
	private String colorSleeves;
	
	
	public shirts(String size, String color, int numberOfButtons, String colorSleeves) {
		super(size, color);
		this.numberOfButtons = numberOfButtons;
		this.colorSleeves = colorSleeves;
	}
	public int getNumberOfButtons() {
		return numberOfButtons;
	}
	public void setNumberOfButtons(int numberOfButtons) {
		this.numberOfButtons = numberOfButtons;
	}
	public String getColorSleves() {
		return colorSleeves;
	}
	public void setColorSleves(String colorSleves) {
		this.colorSleeves = colorSleves;
	}
	@Override
	public String toString() {
		String a = "Shirt object - " + super.toString() + ", number of buttons: " + numberOfButtons + ", color of sleeves: "+ colorSleeves;
		return a;
	}
}