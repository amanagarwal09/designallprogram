package Abstract_Factory_Pattern;

public class ToysOrder extends Order {

	public ToysOrder(channel location) {
		super(producttype.Toys, location);
		processOrder();
	}

	@Override
	void processOrder() {
		// TODO Auto-generated method stub
		System.out.println("Toys Order accepted");
	}

}
