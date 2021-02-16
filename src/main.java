
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Atm atm=new Atm();
		Account account=new Account("haluk","12345",2000);
		atm.play(account);
		System.out.println("The exit is done...");
	}

}
