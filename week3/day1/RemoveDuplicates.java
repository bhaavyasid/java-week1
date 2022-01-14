package week3.day1;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[]args) {
		//a) Use the declared String text as input
	String text = "We learn java basics as part of java sessions in java week1";
			
 // b) Initialize an integer variable as count	
int count = 0;
 // c) Split the String into array and iterate over it 

String []str=text.split("");
//* d) Initialize another loop to check whether the word is there in the array
 
Set<String>duplname= new LinkedHashSet<String>();
 //* e) if it is available then increase and count by 1. 
 
for (String remove :s
		tr ) {
     duplname.add(remove);
 //* f) if the count > 1 then replace the word as "" 

     if (count>1) {
     System.out.println("duplname");

}
 //* g) Displaying the String without duplicate words	
//System.out.println("duplname");
 }
	}
}
 
/*String name="We learn java basics as part of java sessions in java week1";
int count=0;
String[]str=name.split(" ");
Set<String>duplname=new LinkedHashSet<String>();
for (String remove :str ) {
    duplname.add(remove);
    if(count>1) {
        System.out.println();
    }    
}

System.out.println(duplname);
	    
	}
}*/
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		
	