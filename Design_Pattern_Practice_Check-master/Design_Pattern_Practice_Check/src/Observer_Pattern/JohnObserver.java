package Observer_Pattern;

public class JohnObserver implements INotificationObserver {

	private String name;
	
	public JohnObserver()
	{
		this.name="John";
	}
	
	
	@Override
	public void OnServerDown() {
		System.out.println("The notification has been received by :: "+ this.name);
		
	}


	@Override
	public String toString() {
		return name;
	}
	
	

}
