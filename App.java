package UI_Application;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		User_Application u = new User_Application ("Pooja");
		try {
			u.showMenu();
		} catch (Exception e) {
			System.out.println("Please enter numbers only.... ");
		}
	}


}

