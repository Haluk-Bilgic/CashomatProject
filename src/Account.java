
public class Account {

private String username;
private String password;
private int balance;

public Account(String username, String password, int balance) {
	
	this.username = username;
	this.password = password;
	this.balance = balance;
}
public String getusername() {
	return username;
}
public void setKullaniciadi(String username) {
	this.username = username;
}
public String getpassword() {
	return password;
}
public void setpassword(String password) {
	this.password = password;
}
public int getbalance() {
	return balance;
}
public void setbalance(int balance) {
	this.balance = balance;
}
public void depositMoney(int amount){
	balance+=amount;
	System.out.println("Your new balance:"+balance);
}
public void drawMoney(int amount){
	if((balance-amount)<0){
		System.out.println("You do not have sufficient funds...");
	}else{
		balance-=amount;
		System.out.println("Your new balance:"+balance);

	}
}


}
