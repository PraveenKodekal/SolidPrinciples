package solidPrinciples.srp;

public class AccountService {
//	 This is not following the Single Responsibilty Prince
//	since this class behaving the 3 fuunctinalities
AccountCreate create= new AccountCreate();
NotificationService notification= new NotificationService();


public void openAcount() {
		
		System.out.println("Open Account");
		create.createAccount();
		notification.postNotify();
		
	}
	public static void main(String[] args) {
		
	AccountService service= new AccountService();
	service.openAcount();
	
	}
}

class AccountCreate {
	public void createAccount() {
//		dealing with database
		System.out.println("Store Account object in database");
	}
}

class NotificationService {
	public void postNotify() {
//		sending post notification
		System.out.println("Send notification");

	}
}
