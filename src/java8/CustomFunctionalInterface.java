package java8;

public class CustomFunctionalInterface {

	public static void main(String[] args) {
		SumInterface total = (a, b) -> {
			return a+b;
		};
		System.out.println(total.sum(10, 20));
		System.out.println(new SumClass().sum(10, 20));
	}
}

@FunctionalInterface
interface SumInterface {
	int sum(int a, int b);
}

class SumClass implements SumInterface {

	@Override
	public int sum(int a, int b) {
		return a+b;
	}
	
}