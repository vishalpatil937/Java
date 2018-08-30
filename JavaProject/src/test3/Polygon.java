package test3;

public abstract class Polygon {
	double area;
	public  void calcArea(double l, double w) {
		area=l*w*543;
	}

	Polygon(){
		System.out.println("Hello");
	}
}
