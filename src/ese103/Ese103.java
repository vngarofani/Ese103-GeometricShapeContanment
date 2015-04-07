package ese103;

import java.io.*;
import geometricshapes.*;

public class Ese103 {

	public static void main(final String[] args) throws IOException {
		
	Circle circleArray[] = new Circle [3];
	Triangle triangleArray[] = new Triangle[3];
	
	circleArray[0] =new Circle (0,0,0);
	circleArray[1] =new Circle (0,0,0);
	circleArray[2] =new Circle (0,0,0);
	Circle a,b ;
	triangleArray[0] =new Triangle (0,0,1);
	triangleArray[1] =new Triangle (0,0,1);
	triangleArray[2] =new Triangle (0,0,1);
	Triangle c,d;
	
	for (int i=0; i<circleArray.length; i++){
		a = circleArray[i];
		b = circleArray[(i+1) % circleArray.length];
		
		if(a.contains(b)){
			System.out.println(a + " contiene " + b);
		}
		else{
			System.out.println(a + " NON contiene " + b);
		}
	}
	for (int i=0; i<triangleArray.length; i++){
			c = triangleArray[i];
			d = triangleArray[(i+1) % triangleArray.length];
			
			if(c.contains(d)){
				System.out.println(c + " contiene " + d);
			}
			else{
				System.out.println(c + " NON contiene " + d);
			}
		}
		
	
	}
}

	
	
	
	   