package geometricshapes;

public class Triangle extends GeometricShape{

	private double xV;
	private double yV;
	private double l;

	
	public Triangle(double xV, double yV, double l) {

		this.xV = xV;
		this.yV = yV;

		if (l <= 0)
			throw new IllegalArgumentException("Il lato deve essere maggiore di 0");

		this.l = l;
	}
	
	
	
	public double getXV() {
		return xV;
	}

	
	public void setXV(double xv) {
		this.xV = xv;
	}


	public double getYV() {
		return yV;
	}

	
	public void setYV(double yv) {
		this.yV = yv;
	}

	
	public double getL() {
		return l;
	}

	
	public void setL(double l) {

		if (l <= 0)
			throw new IllegalArgumentException("Il lato deve essere maggiore di 0");

		this.l = l;
	}

	
	public double getXMin() {

		return this.xV;

	}


	public double getXMax() {

		return this.xV + this.l;

	}

	
	public double getYMin() {

		return this.yV;

	}

	
	public double getYMax() {

		return this.yV + this.l * Math.sqrt(3) / 2;

	}

	@Override
	public String toString() {
		return "Triangolo [xV=" + xV + ", yV=" + yV + ", l=" + l + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(l);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(xV);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(yV);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Triangle other = (Triangle) obj;
		if (Double.doubleToLongBits(l) != Double.doubleToLongBits(other.l))
			return false;
		if (Double.doubleToLongBits(xV) != Double.doubleToLongBits(other.xV))
			return false;
		if (Double.doubleToLongBits(yV) != Double.doubleToLongBits(other.yV))
			return false;
		return true;
	}
	

}