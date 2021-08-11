package factory;

public class Note8 implements Telephone{
	
	private String model;

	private String battary;
	
	private int weight;
	
	private int height;

	public Note8(String model, String battary, int weight, int height) {
		super();
		this.model = model;
		this.battary = battary;
		this.weight = weight;
		this.height = height;
	}

	@Override
	public String getModel() {
		return null;
	}

	@Override
	public String getBattary() {
		return null;
	}

	@Override
	public int getWeight() {
		return weight;
	}

	@Override
	public int getHeight() {
		return height;
	}

}
