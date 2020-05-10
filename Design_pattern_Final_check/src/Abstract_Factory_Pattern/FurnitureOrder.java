package Abstract_Factory_Pattern;

public class FurnitureOrder extends Order {

	public FurnitureOrder(channel location) {
		super(producttype.Furniture, location);
		processOrder();
	}

	@Override
	void processOrder() {
		// TODO Auto-generated method stub
		System.out.println("Furniture Order accepted");
	}

}
