package week3.day1;


import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[]args) {
 
String name="We learn java basics as part of java sessions in java week1";
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
}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		
	