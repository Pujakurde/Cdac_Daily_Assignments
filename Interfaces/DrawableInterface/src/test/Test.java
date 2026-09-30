package test;

import app.Drawable;
import shape.Circle;
import shape.Rectangle;
import shape.Triangle;

public class Test {

	public static void main(String[] args) {
		Drawable shapes[] = { new Rectangle(0, 0), new Circle(0), new Triangle(0, 0) };
		Drawable shapes1[] = { new Rectangle(10, 20), new Circle(30), new Triangle(50, 100) };
		for(int i=0;i<shapes.length;i++)
		{
			System.out.println("The shape area is: "+shapes[i].calArea());
			shapes[i].drawShape();
		}
		System.out.println("************************************");
		for(int i=0;i<shapes1.length;i++)
		{
			System.out.println("The shape area is: "+shapes1[i].calArea());
			shapes1[i].drawShape();
		}

	}

}
