package shape;

import app.Drawable;

public class Rectangle implements Drawable {
	
	double length,breadth;
	
	public Rectangle() {
		super();
	}
	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	public void drawShape()
	{
		System.out.println("In the reactangle class");
		
	}
	public double calArea()
	{
		return length* breadth;
	}

}
