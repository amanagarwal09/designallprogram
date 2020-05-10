package Abstract_Factory_Pattern;

public class MicroCar extends Car {

	public MicroCar(Location location) {
		super(CarType.MICRO, location);
		construct();
	}

	@Override
	void construct() {
		System.out.println("Connecting to Micro Car");

	}

}
