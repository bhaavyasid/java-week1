package week3.day1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,11,4,6,7};
		Set<Integer> data1=new LinkedHashSet<Integer>();
	 for (int i = 0; i < data.length; i++) {
		data1.add(data[i]);
	}
		List<Integer>lst=new ArrayList<Integer>(data1);
	
		int size=lst.size();

		System.out.println("second largest number is :"+lst.get(size-2));

}
}