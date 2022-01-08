package week3.day1;

public class Mobile {

	
	public void sendMessage()
	{
		System.out.println("send message as hi");
	}
	public void makeCall()
	{
		System.out.println("make call to sid");
	}
	public void saveContact()
	{
		System.out.println("savecontact-99890998909 ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Mobile mob=new Mobile();
         mob.sendMessage();
         mob.makeCall();
         mob.saveContact();
	}

}
