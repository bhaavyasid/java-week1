package week3.day1;

public class FindTypes {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "$$ Welcome to 2nd Class of Automation $$ ";

		// Here is what the count you need to find
		int  letter = 0, space = 0, num = 0, specialChar = 0;

		// Build the logic to find the count of each
		 //Pseudo Code:
			//a) Convert the String to character array
			char[] c= test.toCharArray();
			
			//b) Traverse through each character (using loop)
			for (int i = 0; i < c.length; i++) {
				
			
			//c) Find if the given character is what type using (if)
			if (Character.isLetter(c[i])) {
				letter++;
			}
			
			else if (Character.isDigit(c[i])) {
				num++;
			}
			else if (Character.isSpace(c[i])){
				space++;
			}
			else {
				specialChar++;
							//i)  Character.isLetter
			}
			}
					//ii) Character.isDigit
					//iii)Character.isSpaceChar
					//iv) else -> consider as special character
		

		// Print the count here
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);

	}

}
	

