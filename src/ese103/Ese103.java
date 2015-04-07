package ese103;

import java.io.IOException;

import geometricshapes.*;

public class Ese103 {

	public static void main(final String[] args) throws IOException {
	
	GeometricShape shapeArray[] = new GeometricShape[4];	

	shapeArray[0] = new Circle(0, 0, 1);
	shapeArray[1] = new Circle(0, 0, 1);
	shapeArray[2] = new Circle(1, 0, 1);
	shapeArray[3] = new Triangle(0, 0, 1);

	
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
	
	


	
	
	
	   