//*******************************************************************
// Octagon Class - Ch9, Ex15, p665
//  
// Write a class named Octagon whose object represents regular octagons.
// Class should implement a shape interface, including methods for its
// area and perimeter. Include test methods from the Client Main.
// 
//By: Michael Gilson
//Date: 4/14/2020
//*******************************************************************

// Octagon class that implements the ShapeInterface
public class Octagon implements ShapeInterface {
	// encapsulated field for Octagon
	private double sideLength;
    
    // Constructs a new octagon with a required parameter for sideLength
    public Octagon(double side) {
        this.sideLength = side;
    }
	
 
    // Getter and Setter methods for the encapsulated field 
    public double getSideLength() {
		return sideLength;
	}

	public void setSideLength(double sideLength) {
		this.sideLength = sideLength;
	}
    
	// Methods required by the ShapeInterface Interface
	@Override
	public double getArea() {
		// returns Area of Octagon based on sideLength
		return 2*(1 + Math.sqrt(2))* Math.pow(sideLength, 2);
	}

	@Override
	public double getPerimeter() {
		// returns Perimeter of Octagon based on sideLength
		return sideLength * 8;
	}
	
	// Method to display Area and Perimeter info for Octagon object, with
	//   Area formatted to 2 decimal places.
	public String info() {
		return String.format("Area = %.2f, Perimeter = " + getPerimeter(), getArea());

	}
	

}
