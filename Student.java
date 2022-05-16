package org.student;

import org.department.Department;

public class Student extends Department{
	
	public void studentName()
	{
	    System.out.println("Name of the Student is Sushvith"); 
	}
	public void studentDept()
	{ 
		 System.out.println("Department of the Student is CSE");
	}
	public void studentId()
	{
		System.out.println("ID of the student is 13833");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Student obj = new Student();
     obj.collegeName();
     obj.collegeCode();
     obj.collegeRank();
     obj.deptName();
     obj.studentName();
     obj.studentDept();
     obj.studentId();	
	}

}
