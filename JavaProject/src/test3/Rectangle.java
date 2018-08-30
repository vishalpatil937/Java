package test3;

public class Rectangle extends Polygon{
	@Override
	public void calcArea(double l, double w) {
		// TODO Auto-generated method stub
		area=l*w;
		System.out.println("Rectangle"+area);
	}
	
	Rectangle(){
		System.out.println("In rect");
	}
	
	public void AnyMethod() {
		System.out.println("Kontihi method");
	}

}
