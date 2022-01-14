package week3.day1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Build a logic to find the given string is palindrome or not
	     //* Pseudo Code
		
		 //* a) Declare A String value as"madam"
		String s1="madam";
	
		 // * b) Declare another String rev value as ""
        String rev="";
		 //* c) Iterate over the String in reverse order
         for(int i=s1.length()-1;i>=0;i--)
		// * d) Add the char into rev
        	 rev=rev+s1.charAt(i);
		 //* e) Compare the original String with the reversed String, if it is same then print palinDrome 
         {System.out.println("the reverse string is"+rev);
		 //* Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 

	}
         if(s1.equals(rev))
         {
        	 System.out.println(rev+"string is palindrome");
         }
         else
         {
        	 System.out.println(rev+"string is not palindrome");
         }
	}

}
