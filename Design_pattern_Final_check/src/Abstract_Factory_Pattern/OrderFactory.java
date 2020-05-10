package Abstract_Factory_Pattern;

public class OrderFactory {

	public static Order buildorder(producttype type, channel chan) {
		if (producttype.Electronic.compareTo(type) == 0) {
			return new ElectronicOrder(chan);
		} else if (producttype.Furniture.compareTo(type) == 0) {
			return new FurnitureOrder(chan);
		} else {
			return new ToysOrder(chan);
		}
	}
	
	
	
	

}
