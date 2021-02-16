import java.util.Scanner;


public class Login {

	public boolean login(Account account){
		Scanner scan=new Scanner(System.in);
		String username;
		String password;
		System.out.print("Username:");
		username=scan.nextLine();
		System.out.print("Password:");
		password=scan.nextLine();
		if(account.getusername().equals(username)&&account.getpassword().equals(password)){
			return true;
		}else{
			return false;
		}
				
		
		
		
		
	}
}
