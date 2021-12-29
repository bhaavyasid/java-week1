package week1.day1;

public class palnidromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int num =34345;
          
          
          int temp = num, sum = 0, r;
          while (num > 0) {
              r = num % 10; // getting remainder=>454%10=>4
              sum = (sum * 10) + r; // 0+4=>4, 4*10+5=>45,
              //sum=1454
              num = num / 10;//45
          }
          if (temp == sum)
              System.out.println("palindrome number ");
          else
              System.out.println("not palindrome");
      }

          
	}


