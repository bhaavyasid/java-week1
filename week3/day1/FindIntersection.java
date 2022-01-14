package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		List<Integer>lst=new ArrayList<Integer>();
		List<Integer>lst2=new ArrayList<Integer>();
		lst.add(3);
		lst.add(2);
		lst.add(11);
		lst.add(4);
		lst.add(6);
		lst.add(7);
		
		lst2.add(1);
		lst2.add(2);
		lst2.add(8);
		lst2.add(4);
		lst2.add(9);
		lst2.add(7);
		Collections.sort(lst);
		Collections.sort(lst2);
		lst.retainAll(lst2);
		System.out.println(lst);
}
}