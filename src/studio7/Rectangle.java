package studio7;

public class Rectangle {

	//instance methods
	private double length;
	private double width;
	private boolean isSquare;
	
	//declaring constructors
	public Rectangle(double l, double w)
	{
		length = l;
		width = w;
		if (length == width)
		{
			isSquare = true;
		}
		else
		{
			isSquare = false;
		}
	}
	
	//get methods
	public double getLength()
	{
		return length;
	}
	public double getWidth()
	{
		return width;
	}
	public boolean getIsSquare()
	{
		return isSquare;
	}
	
	//set methods
	public void setLength(double n)
	{
		length = n;
	}
	public void setWidth(double n)
	{
		width = n;
	}
	//does is square update to new boolean value after length and width are changed?
	
	public double perimeter () {
		return (length * 2)+ (width * 2) ; 
	}
	public double area() {
		return length * width;
	}
	
}
