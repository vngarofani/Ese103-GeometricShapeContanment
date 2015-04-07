package geometricshapes;

public class Square extends Rectangle{

	public Square(double xV, double yV, double l){
		
		if(l<=0) throw new IllegalArgumentException("Il lato del quadrato deve essere maggiore di 0");
		else{
				this.xSideLength=l;
				this.ySideLength=l;
				this.xV=xV;
				this.yV=yV;
		}
		
	}
	
	
	public void setL(double l){
		if(l<=0) throw new IllegalArgumentException("Il lato del quadrato deve essere maggiore di 0");
		
		else{
				
				this.setXSideLength(l);
		}
	}
	
public void setXSideLength(double l){
		
		if(l <= 0)
			throw new IllegalArgumentException("The length of the side must be positive");
			else {
				this.xSideLength = l;
				this.ySideLength = l;
			}
	}
	
	
	public void setYSideLength(double l){
		
		if(l <= 0)
			throw new IllegalArgumentException("The length of the side must be positive");
			else {
				this.xSideLength = l;
				this.ySideLength = l;
			}
	}
	
	public double getL(){
		return this.ySideLength;
	}
	@Override
	public String toString() {
		return "Quadrato [xV=" + xV + ", yV=" + yV + ", l="+ xSideLength+"]";
	}
	
	 
	
	
}