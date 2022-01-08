package week3.day1;

public class SmartPhone extends Mobile {

	
	public void acessWhatsapp()
	{
		 System.out.println("whatsapp accessing");
	}
	public void  takeVideo()
	{
		System.out.println("new video is added");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        SmartPhone s1=new SmartPhone();
        s1.acessWhatsapp();
	}

}
