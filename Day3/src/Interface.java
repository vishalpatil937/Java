
public class Interface {

	public static void main(String[] args) {
		Animal animal;
		animal=new Dog();
		animal.eat();
		animal.hunt();
		
		animal=new Cat();
		animal.eat();
		animal.hunt();
		System.out.println(Animal.var);
		
	}
}	
