package abstractFactory;

public class Note8Factory implements TelephoneFactory {
	@Override
	public Telephone getTelephone(String model, String battary, int weight, int height) {
		return new Note8(model, battary, weight, height);
	}

}
