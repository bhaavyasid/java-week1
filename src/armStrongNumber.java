

public class armStrongNumber {
	public static void main(String args[])
	{
	int input =153;
	int orgNum=input;
	int sum=0;
	while(input>0)
	{
		int rem=input%10;
		sum=sum+(rem*rem*rem);
		input=input/10;
	}
	if(sum==orgNum)
	{
		System.out.println("given number is armstrong");
		
	}
	else
	{
		System.out.println("given number is not armstrong");
	}
	
	}
}
