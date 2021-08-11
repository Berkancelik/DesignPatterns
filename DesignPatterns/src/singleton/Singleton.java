package singleton;
public class Singleton {

	private static Singleton singleton = new Singleton();

	private static int number = 0;

	private Singleton() {
		System.out.println("I was created");

	}

	public static Singleton getSingleton() {

		if (singleton == null) {
			synchronized (Singleton.class) {

				if (singleton == null) {
					singleton = new Singleton();
				}
			}
		}

		number++;
		System.out.println(number);
		return singleton;

	}

}
