package Abstract;

public abstract class Shape {
	protected float area;
	abstract void calArea();
	void display()
	{
		System.out.println("Area of shape is :"+ area);
	}
	
}
