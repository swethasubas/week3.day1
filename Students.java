package studentinfo;

public class Students {

	public void getStudentInfo(int id)
	{
		System.out.println("Student ID :" +id);
	}
	public void getStudentInfo(int id, String name)
	{
		System.out.println("Student ID :"  +id+"  Student Name :" +name);
	}
	public void getStudentInfo(String email, int phonenumber)
	{
		System.out.println("Student Email :" +email  + "  Student Phone Number :" +phonenumber);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students obj = new Students();
		obj.getStudentInfo(767);
		obj.getStudentInfo(2345,"Sushvith");
		obj.getStudentInfo("abc@gmail.com", 767389393);
		
		
		

	}

}
