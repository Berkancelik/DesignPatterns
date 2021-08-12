package abstractFactory;

public interface TelephoneFactory {
	public static Telephone getTelephone(String model, String battary, int weight, int height) {
		
		Telephone telephone;
		if ("S8".equalsIgnoreCase(model)) {
			telephone = new S8(model, battary, weight, height);
		}else if ("Note 8".equalsIgnoreCase(model)) {
			telephone = new Note8(model, battary, weight, height);
		}else {
			throw new RuntimeException("Geçerli bir model değildir!");
		}
		
		return telephone;
				
		
	}
}
