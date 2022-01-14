package week3.day1;

public class StudentInfo {
	
	
	public void getStudentInfo(int id)
	{
		  System.out.println(id);
	}
	
	public void getStudentInfo1(int id,String name )
	{
		  System.out.println ("id="+id); 
		 System.out.println("name="+name);
	}
	public void getStudentInfo2(String email,int phonenumber)
	{
		System.out.println("emailid ="+email);
		System.out.println("phonenumber="+phonenumber);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentInfo stu=new StudentInfo();
		stu.getStudentInfo(1127728);
	    stu.getStudentInfo1(567," bhavya");
	    stu.getStudentInfo2("bhavi@gmail.com", 887655789);
	}

}
