package geometricshapes;

public class Rectangle extends GeometricShape {

	protected double xV;
	protected double yV;
	protected double xSideLength;
	protected double ySideLength;
	
	
	public Rectangle(double xV,double yV,double xSideLenght,double ySideLenght){
		this.xV=xV;
		this.yV=yV;
		if(xSideLenght<=0 || ySideLenght<=0){
			throw new IllegalArgumentException("I lati devono essere maggiori di 0");
		}
		else{
			this.xSideLength=xSideLenght;
			this.ySideLength=ySideLenght;
		}
		
	}
	
	protected Rectangle(){}

	
	public double getXV() {
		return xV;
	}

	
	public void setXV(double xV) {
		this.xV = xV;
	}

	
	public double getYV() {
		return yV;
	}

	
	public void setYV(double yV) {
		this.yV = yV;
	}

	
	public double getXSideLength() {
		return xSideLength;
	}

	
	public void setXSideLength(double xSideLenght) {
		if(xSideLenght<=0)throw new IllegalArgumentException("I lato parallelo all'asse X deve essere maggiore di 0");
		else this.xSideLength = xSideLenght;
	}

	
	public double getYSideLength() {
		return ySideLength;
	}

	public void setYSideLength(double ySideLenght) {
		if(ySideLenght<=0)throw new IllegalArgumentException("I lato parallelo all'asse Y deve essere maggiore di 0");
		else this.ySideLength = ySideLenght;
	}
	
	
	
	double getXMin() {
		return xV;
	}

	

	double getYMin() {
		return yV;
	}

	
	
	double getXMax() {
		return xV+xSideLength;
	}

	
	
	double getYMax() {
		return yV+ySideLength;
	}

	public String toString() {
		return "Rettangolo [xV=" + xV + ", yV=" + yV + ", xSideLenght="+ xSideLength + ", ySideLenght=" + ySideLength + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		if (Double.doubleToLongBits(xSideLength) != Double
				.doubleToLongBits(other.xSideLength))
			return false;
		if (Double.doubleToLongBits(xV) != Double.doubleToLongBits(other.xV))
			return false;
		if (Double.doubleToLongBits(ySideLength) != Double
				.doubleToLongBits(other.ySideLength))
			return false;
		if (Double.doubleToLongBits(yV) != Double.doubleToLongBits(other.yV))
			return false;
		return true;
	}

	
	
	

}
