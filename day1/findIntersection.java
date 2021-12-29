package week1.day1;

public class findIntersection {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int [] p = {3,2,11,4,6,7};
		int [] q = {1,2,8,4,9,7};
		System.out.println("intersection of two numbers are");
		for(int i=0;i<p.length;i++)
		{
			for(int j=0;j<q.length;j++)
				{
				 if(p[i]==q[j])
				  {
					System.out.println(q[j]);
				   }
				}
		  }
		

	}

}
