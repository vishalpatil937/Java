package test3;

public class PolyMian {
	public static void main(String[] args) {
		Polygon p;
//		p=new Polygon();
//		p.calcArea(5.0, 6.0);
		p=new Triangle();
		p.calcArea(6, 3);
		p=new Rectangle();
		p.calcArea(10, 8);
		((Rectangle) p).AnyMethod();
	}
}
