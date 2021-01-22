// Write a calculator class which will do three 
//operations using parameter argumemnts – addition, subtraction and division. 
//User class will use those operations and will display the result of 
//those operations. (Use inheritance).
//The output example:
//The addition is: 50
//The subtraction is: 25
//The multiplication is: 144

public class ChildClass extends ParentClass {

	public static void main(String[] args) {

		ChildClass obj = new ChildClass();
		obj.display();
	}

	public void testchild() {
		System.out.println("im child");

		// ChildClass obj = new ChildClass();
		// obj.display(10, 20);

	}
}
