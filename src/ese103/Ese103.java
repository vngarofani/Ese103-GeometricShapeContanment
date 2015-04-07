package ese103;

import java.io.IOException;

import geometricshapes.*;

public class Ese103 {

	public static void main(final String[] args) throws IOException {
	
	GeometricShape shapeArray[] = new GeometricShape[8];	

	shapeArray[0] = new Circle(0, 0, 1);
	shapeArray[1] = new Circle(0, 0, 1);
	shapeArray[2] = new Rectangle(1, 1, 1, 2);
	shapeArray[3] = new Rectangle(1, 1, 1, 2);
	shapeArray[4] = new Triangle(0, 0, 1);
	shapeArray[5] = new Triangle(0, 0, 1);
	shapeArray[6] = new Square(1, 1, 1);
	shapeArray[7] = new Square(1, 1, 1);
	
	
	GeometricShape a, b;
	for (int i = 0; i < shapeArray.length; i++) {
		a = shapeArray[i];
		for (int j = 0; j < shapeArray.length; j++) {
			b = shapeArray[j];
			if (a != b) {
				if (a.contains(b))
					System.out.println(a + " contiene " + b);
				else
					System.out.println(a + " NON contiene " + b);
				}
			}
		}
	}
}		
	
	


	
	
	
	   