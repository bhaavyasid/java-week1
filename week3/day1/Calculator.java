package week3.day1;

public class Calculator {
	
	public void add(int id,int id2)
	{
		System.out.println(id+id2);
	}
	public void add(int id3,int id4,int id1)
	{
     System.out.println(id3+id4+id1);
	}
	public void mutliple(int num1,int num2)
	{
		    System.out.println(num1*num2);
		 
	}
	public void mutliple(int num3,double num2)
	{
		    System.out.println(num3*num2);
		 
	}
	public void subtract1(int value1, int value2)
	{
		    System.out.println(value1-value2);
		 
	}
	public void subtract(double num1,double num2)
	{
		    System.out.println(num1-num2);
		 
	}
	public void divide1(int num1,int num2)
	{
		    System.out.println(num1%num2);
		 
	}
	public void divide(int num1,double num2)
	{
		    System.out.println(num1%num2);
		 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Calculator cal=new Calculator();
     cal.add(2, 4);
     cal.add(6, 7, 9);
     cal.subtract(4,6 );
     cal.subtract1(8, 4);
     cal.mutliple(6, 4);
     cal.mutliple(1, 5);
     cal.divide(5, 6);
     cal.divide1(4, 3);
     
	}

}
