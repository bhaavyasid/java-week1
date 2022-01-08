package week3.day1;

public class BankInfo {

	public void saving()
	{
		System.out.println("saving account is opened");
	}
	public void fixed()
	{
		System.out.println("fixed amount is 5l");
	}
	public void deposit()
	{
	 System.out.println("deposit is 10k");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    BankInfo balance= new BankInfo();
    balance.deposit();
    balance.fixed();
    balance.saving();
    
	}

}
