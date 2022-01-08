package week3.day1;

public class AxisBank extends BankInfo {
	public void deposit()
	{
		System.out.println("deposit is 0");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        AxisBank amount=new AxisBank();
        BankInfo b1=new BankInfo();
        
        amount.deposit();
        b1.deposit();
        
	}

}
