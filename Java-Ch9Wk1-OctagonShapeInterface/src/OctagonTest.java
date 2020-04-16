import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class OctagonTest {

	// we start by creating a new instance of the Octagon object we are trying to test
	Octagon o = new Octagon(5);
	
	@Test
	void test() {
		// Testing the getSideLength() method - use assertEquals with the expected
		//   answer, and calling the getSideLength() method.
		//	 We assert the test should return "5".
		assertEquals(5, o.getSideLength());
		
		// Change the side length to 3, and re-run the test to confirm setSideLength()
		//   method correctly changed the side length to "3". 
		o.setSideLength(3);
		assertEquals(3, o.getSideLength());
		
		// assert the getPerimeter() method functions and returns 3*8= "24". 
		assertEquals(24, o.getPerimeter());
		
		// assert the getArea() method functions and returns the actual area.
		assertEquals(43.45584412271571, o.getArea());
		
		// assert the info() method outputs the correct information string.
		assertEquals("Area = 43.46, Perimeter = 24.0", o.info());
		
	}

}
