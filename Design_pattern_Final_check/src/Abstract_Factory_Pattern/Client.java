package Abstract_Factory_Pattern;

public class Client {
	public static void main(String[] args) {

		System.out.println(OrderFactory.buildorder(producttype.Electronic, channel.Ecommercewebsite));
		System.out.println(OrderFactory.buildorder(producttype.Toys, channel.TeleCallerAgentsApplication));
		System.out.println(OrderFactory.buildorder(producttype.Furniture, channel.Ecommercewebsite));
		
	
		
		
	}
}
