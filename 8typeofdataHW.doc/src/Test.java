
public class Test {

	public static void main(String[] args) {
		Person p = new Person();
		p.name = "Jhalak";
		p.age = 30;
		System.out.println("name: " + p.name);
		System.out.println("age : " + p.age);
		p.speak();
		
		
		Person p1 = new Person();
		p1.name = "Tanjil";
		p1.age = 33;
		System.out.println("name: " + p1.name);
		System.out.println("age : " + p1.age);
		p1.speak();
		
		
	}

}
