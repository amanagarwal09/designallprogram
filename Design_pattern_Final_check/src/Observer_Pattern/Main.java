package Observer_Pattern;

public class Main {

	public static void main(String[] args) {
		NotificationService service = new NotificationService();
		SteveObserver Steve = new SteveObserver();
		JohnObserver John = new JohnObserver();
		service.addSubscriber(John);
		service.addSubscriber(Steve);
		service.notifySubscriber();
		service.removeSubscriber(John);
		service.notifySubscriber();
	}

}
