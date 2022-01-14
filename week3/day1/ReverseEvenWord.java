package week3.day1;

public class ReverseEvenWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Build a logic to reverse the even position words (output: I ma a erawtfos tester)
String even="I am a Software tester";
String arr[]=even.split(" ");
for (int i = 0; i < arr.length; i++) {
    if(i%2==0) {
        System.out.print(arr[i]);
        System.out.print(" ");
    }
    else {//[ am  Software ]
        char reverse[]=arr[i].toCharArray();
        for(int j=(reverse.length)-1;j>=0;j-- ) {//str.len-1 2  >0 1 0
            System.out.print(reverse[j]);
    }
        System.out.print(" ");
}
}
}
}