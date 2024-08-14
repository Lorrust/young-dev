package basic.oop;

public class Person {

	static double maxHeight = 3;
	private String name;
	protected String eyeColor;
	
	protected void setEyeColor(String color) {
		eyeColor = color;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private Double height;
	
	public Double getHeight() {
		return height;
	}

	public void setHeight(Double newHeight) {
		if (newHeight > maxHeight) {
			System.out.println("Maximum height: " + maxHeight);
			newHeight = maxHeight;
		}
		height = newHeight;
	}

}