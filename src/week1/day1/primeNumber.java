package week1.day1;

public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=13;
	    boolean prime = true;
	    for(int i=2;i<n;i++) {
	    
	      if(n%i==0) {
	    	  prime=false;
	    	 break;
	      }
	    }
	
	   if (prime==true)
	   {
		  System.out.println("its prime number"); 
	   }
	   else
	   {
	   System.out.println("its not a prime number ");
	   }
	}
}
