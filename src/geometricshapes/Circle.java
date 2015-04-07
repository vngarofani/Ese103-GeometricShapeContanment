package geometricshapes;

public class Circle extends GeometricShape{
	
	double xc;
	double yc;
	double r;
	
	public Circle(double xc, double yc, double r) {
		super();
		this.xc = xc;
		this.yc = yc;
		this.r = r;
		if(r < 0) {
			throw new IllegalArgumentException("r must be greater 0");
		}
		else{
	            this.r = r;
	        }
		
	}
	
	

	public double getXc() {
		return xc;
	}



	public void setXc(double xc) {
		this.xc = xc;
	}



	public double getYc() {
		return yc;
	}



	public void setYc(double yc) {
		this.yc = yc;
	}



	public double getR() {
		return r;
	}



	public void setR(double r) {
		this.r = r;
	}


	 public double getXMin(){
		 
	     return (this.xc - r);
	 }
	 
	 public double getYMin(){
		 
	      return (this.yc - r);
	 }
	 
	 public double getXMax(){
		 
	      return (this.xc + r);
	 }
	 
	 public double getYMax(){
	      return (this.yc + r);
	 }

	 

	@Override
	public String toString() {
		return "Circle [xc=" + xc + ", yc=" + yc + ", r=" + r + "]";
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (Double.doubleToLongBits(r) != Double.doubleToLongBits(other.r))
			return false;
		if (Double.doubleToLongBits(xc) != Double.doubleToLongBits(other.xc))
			return false;
		if (Double.doubleToLongBits(yc) != Double.doubleToLongBits(other.yc))
			return false;
		return true;
	}


}