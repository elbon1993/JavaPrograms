
public class SingletonExample {
	public static void main(String[] args) {
		Singleton obj = Singleton.getObject();
		System.out.println(obj.getFullName("chandrahas", "chatta"));
	}
}

class Singleton {
	
	private static final Singleton obj = new Singleton();

	private Singleton() {
	}

	public static Singleton getObject() {
		return obj;
	}
	
	public String getFullName(String fName, String lName) {
		return fName + " " + lName;
	}
}