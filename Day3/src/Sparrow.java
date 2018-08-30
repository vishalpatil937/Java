
public class Chimni implements Animal,Bird{

	@Override
	public void canfly() {
		System.out.println("Can Fly");
		
	}

	@Override
	public void eat() {
		System.out.println("Food");
	}

	@Override
	public void hunt() {
		System.out.println("Yes");
	}

}
