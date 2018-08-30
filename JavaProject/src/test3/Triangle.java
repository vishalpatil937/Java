package test3;

public class Triangle extends Polygon{
 
Triangle(){
	System.out.println("In tri");
}
	
	@Override
public void calcArea(double l, double w) {
	// TODO Auto-generated method stub
	area=0.5*l*w;
	System.out.println("Triangle"+area);
}
}
