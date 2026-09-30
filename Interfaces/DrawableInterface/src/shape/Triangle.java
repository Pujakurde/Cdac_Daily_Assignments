package shape;

import app.Drawable;

public class Triangle implements Drawable {
	double base,height;

	
	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}
	
	public void drawShape()
	{
		System.out.println("in the triangle class");
	}
	public double calArea()
	{
		return 0.5f*base*height;
	}

}
