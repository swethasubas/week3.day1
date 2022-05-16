package bank;

public class AxisBank extends BankInfo{

	public void deposit()
	{
		System.out.println("Calling from Child- deposit method");
	}
	public static void main(String[] args) {
		AxisBank obj = new AxisBank();
		obj.deposit();
		//BankInfo obj1 = new AxisBank();
		//obj1.deposit();
		//BankInfo obj2 = new BankInfo();
		//obj2.deposit();
		
	}
}
