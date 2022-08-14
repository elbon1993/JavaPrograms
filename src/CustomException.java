
class InvalidAgeException extends Exception {

	public InvalidAgeException(String msg) {
		super(msg);
	}

}

public class CustomException {
	public static void main(String[] args) throws InvalidAgeException {
		int age = 15;
		if (age < 18) {
			throw new InvalidAgeException("Not Eligible for voting");
		} else {
			System.out.println("Eligible for voting");
		}
	}
}
