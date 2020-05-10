package Observer_Pattern;

public class SteveObserver implements INotificationObserver {

	private String name;

	public SteveObserver() {
		this.name="Steve";
	}


	@Override
	public void OnServerDown() {

		System.out.println("The notifaction has been received by :: " + this.name);

	}


	@Override
	public String toString() {
		return  name ;
	}

	
}
