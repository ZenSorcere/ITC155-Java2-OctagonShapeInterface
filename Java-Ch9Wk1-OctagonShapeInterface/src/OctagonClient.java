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

public class OctagonClient {

    public static void main(String[] args) {
    	// create an array of Octagon objects called "shapes"
        Octagon[] shapes = new Octagon[3];
        
        // Constructs each array element via the Octagon constructor
        shapes[0] = new Octagon(3);
        shapes[1] = new Octagon(4.4);
        shapes[2] = new Octagon(10);
        
        // for loop that tests and displays the getSideLength and info
        //   methods (which returns Area and Perimeter) for each Octagon
        //   in the shapes array.
        for (int i = 0; i < shapes.length; i++) {
            System.out.printf("For an Octagon with a side length of " + shapes[i].getSideLength() + ":\n\t" + shapes[i].info());
            System.out.println();
            
        }
       
    }
}