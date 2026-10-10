package shape;

import app.Drawable;

public class Circle implements Drawable {
	
	private double radius;
	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}


	public void drawShape()
	{
		System.out.println("in the circle class");
		
	}
	public double calArea()
	{
		return PI* radius*radius;
	}

}
