package java8;

@FunctionalInterface
interface A {

	void display();
	default void display2() {
		System.out.println("display default");
	}
}

@FunctionalInterface
interface B {

	void display();
	default void display2() {
		System.out.println("display default");
	}
//	void display2();
	
}

public class FunctionalInterfaceExample implements A, B {
	public static void main(String[] args) {
		FunctionalInterfaceExample obj = new FunctionalInterfaceExample();
		obj.display2();
	}

	@Override
	public void display2() {
		B.super.display2();
	}

	@Override
	public void display() {
		
	}
	
	
}