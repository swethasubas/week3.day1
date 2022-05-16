package interfaceAssignment;

public class Automation {
	
	public void Java()
	{
		System.out.println("Calling from Java method");
	}
    public void Selenium()
    {
    	System.out.println("Calling from Selenium method");
    }
    public void thisFunction()
    {
    	this.Java();
    	System.out.println("Calling from thisFunction");
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automation obj = new Automation();
		obj.Java();
		obj.Selenium();
		obj.thisFunction();
	}
}
