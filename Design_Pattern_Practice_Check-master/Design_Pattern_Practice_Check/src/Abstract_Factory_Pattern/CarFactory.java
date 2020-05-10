package Abstract_Factory_Pattern;

public class CarFactory {

	public static Car buildCar(CarType model, Location location) {
		if (CarType.LUXURY.compareTo(model) == 0) {
			return new LuxuryCar(location);
		} else if (CarType.MICRO.compareTo(model) == 0) {
			return new MicroCar(location);
		} else {
			return new MiniCar(location);
		}
	}
	
	
	
	

}
