
public class Cat implements Animal{

	@Override
	public void eat() {
		System.out.println("Cat food");
	}

	@Override
	public void hunt() {
		System.out.println("No");
	}

}
