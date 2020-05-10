package Abstract_Factory_Pattern;

public class ElectronicOrder extends Order {

	public ElectronicOrder(channel location) {
		super(producttype.Electronic, location);
		processOrder();
	}

	@Override
	void processOrder() {

		System.out.println("Electronic Order accepted");

	}

}
