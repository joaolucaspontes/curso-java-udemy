package poo;

public class Rectangle {
	
	public double width;
	public double height;
	
	
	
	public double area() {
		return width*height;
	}
	
	public double perimeter() {
		return 2 * width + 2 * height;
	}
	
	public double diagonal() {
		double d = Math.sqrt(width*width + height*height);
		return d;
	}
	
	public String toString() {
		return "AREA = " 
		+ area()
		+ " \nPERIMETER = " 
		+ perimeter()
		+ " \nDIAGONAL = " 
		+ diagonal();
	}
}

