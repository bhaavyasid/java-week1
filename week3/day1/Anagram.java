package week3.day1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          //*Declare a String 
				String text1 = "stops";
			 //*Declare another String
				String text2 = "potss"; 
				int length1,length2;
				
			 //* a) Check length of the strings are same then (Use A Condition)
				length1=text1.length();
			    length2=text2.length();
			     
			    	System.out.println(length1);
			    
						
			 //* b) Convert both Strings in to characters
 char []charArray1=text1.toCharArray();
 char []charArray2=text2.toCharArray();
			 //* c) Sort Both the arrays
 Arrays.sort(charArray1);
 Arrays.sort(charArray2);

			 //* d) Check both the arrays has same value
 if(text1.length() ==text2.length())
 {
	 
		 if(Arrays.equals(charArray1,charArray2))
			   System.out.println("anangram");
 }
 else {
     System.out.println("Not an anagram");
 }
	}
}

			 
	 

 
