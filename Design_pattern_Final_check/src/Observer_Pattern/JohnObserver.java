package Observer_Pattern;

public class JohnObserver implements INotificationObserver {
		
		private String Name="";
		
		public JohnObserver() {
			this.Name="John";
		}
		
		@Override
		public String toString() {
			return "JohnAdminObserver [Name=" + Name + "]";
		}

		@Override
		public void OnTicketBooked() {
			// TODO Auto-generated method stub
			System.out.println("Event details of Event where 100 tickets have been booked notified Admin: "+this.Name);
			
			
		}
		

	}
