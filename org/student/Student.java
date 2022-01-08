package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName()
	{
		System.out.println("bhavyasree");
	}
     public void studentDept()
     {
	System.out.println("InformationTechnology");
	}
     public void studentId()
     {
    	 System.out.println("11751a1259");
     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stud=new Student();
	
		stud.studentName();
		stud.studentDept();
		stud.studentId();
		stud.deptName();
		stud.collegeName();
		stud.collegeCode();
		stud.collegeRank();

	}

}
