import java.util.Scanner;


public class Atm {

	public void play(Account account){
	
	Login login=new Login();
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Welcome To The Bank...");
	System.out.println("**************************");
    System.out.println("Login");
	System.out.println("**************************");
	int rightOfEnrty=3;
	while(true){
		if(login.login(account)){
			System.out.println("Login is successful.");break;
		}else{
			System.out.println("Login is not successful..");
			rightOfEnrty-=1;
			System.out.println("remaining right of enrty:"+rightOfEnrty);
		}if(rightOfEnrty==0){
		System.out.println("Your remaining right of enrty is finished..");return;
	}
	}
	String operations="1-Balance inquiry\n"+
	                "2-Deposit Money\n"+
			        "3-Drawing cash\n"+
	                "press to'q' for exit ";
	System.out.println("********************");
	System.out.println(operations);
	System.out.println("********************");

	while(true){
		System.out.print("Choose your operation:");
		String operation=scan.nextLine();
		if(operation.equals("q")){
			break;
		}else if(operation.equals("1")){
			System.out.println("Your balance:"+account.getbalance());
		}else if(operation.equals("2")){
			System.out.println("How much money do you want to deposit?");
			int amount=scan.nextInt();
			scan.nextLine();
			account.depositMoney(amount);
		}else if(operation.equals("3")){
			System.out.println("How much money do you want to withdraw?");
			int amount=scan.nextInt();
			scan.nextLine();
			account.drawMoney(amount);
		}else{
			System.out.println("invalid transaction..");
		}
	}

	
	
	
	
	
	
}
}
