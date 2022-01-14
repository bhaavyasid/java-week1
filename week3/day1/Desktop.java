package week3.day1;

public class Desktop implements Software {
	public void desktopModel() {
		 System.out.println("desktop model is new");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desktop desk= (Desktop) new Desktop();
		desk.desktopModel();
		desk.softwareResources();
		desk.hardwareResources();
		

	}



	public void hardwareResources() {
		// TODO Auto-generated method stub
		System.out.println("the ram 599");
	}

	public void softwareResources() {
		System.out.println("the software");// TODO Auto-generated method stub
	}

}
