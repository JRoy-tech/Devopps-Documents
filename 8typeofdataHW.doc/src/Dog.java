
public class Dog extends StaticBlock {

	void eat() {
		System.out.println("dog is eating");
	}

	public static void main(String[] args) {

		StaticBlock dg = new StaticBlock();
		dg.eat();

		Dog d = new Dog();
		d.eat();
	}
}
