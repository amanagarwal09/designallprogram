package Observer_Pattern;

import java.util.ArrayList;
import java.util.List;

public class NotificationService implements INotificationService {

	private List<INotificationObserver> observers = new ArrayList<>();

	@Override
	public void AddSubscriber(INotificationObserver observer) {
		observers.add(observer);
		System.out.println(observers);

	}

	@Override
	public void RemoveSubscriber(INotificationObserver observer) {
		observers.remove(observer);
		System.out.println(observers);

	}

	@Override
	public void NotifySubscriber() {
		
		for(INotificationObserver observer : observers)
		{
			observer.OnServerDown();
		}

	}

}
