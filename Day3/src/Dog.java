
public class Dog implements Animal {

	@Override
	public void eat() {
		System.out.println("Dog food");
		
	}

	@Override
	public void hunt() {
		System.out.println("No");
	}

}
