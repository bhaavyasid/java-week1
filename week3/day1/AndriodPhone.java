package week3.day1;

public class AndriodPhone extends SmartPhone {
	
	public void takeVideo()
	{
		System.out.println("videos can be recorded");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       AndriodPhone a1= new AndriodPhone();
       SmartPhone s2=new SmartPhone();
       a1.takeVideo();
       a1.acessWhatsapp();
       s2.saveContact();
       s2.makeCall();
       s2.sendMessage();
       s2.takeVideo();
       
	}

}