package Observer_Pattern;

public class Main {

	public static void main(String[] args) {
		NotificationService service = new NotificationService();
		SteveObserver Steve = new SteveObserver();
		JohnObserver John = new JohnObserver();
		service.AddSubscriber(John);
		service.AddSubscriber(Steve);
		service.NotifySubscriber();
		service.RemoveSubscriber(John);
		service.NotifySubscriber();
	}

}
