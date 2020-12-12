class BankAccount
{
	public static void main(String[] args)
	{
		BankAccount v1 = new BankAccount();
		char bank = 'Y';
		String day = "WED";
		while(bank == 'Y')
		{
			switch(day)
			{
				case "MON":
					v1.CreateAccount();
					break;
				case "TUE":
					System.out.println("Bank cannot be CreateAccount on Tuesday except Monday");
					break;
				default:
					System.out.println("Bank cannot be CreateAccount on other days except Monday");
					break;
				
			}
			System.out.println("Do you want to create another account again (Y/N): ");
                        bank = 'N';
		}
		
	}
	public void CreateAccount()
	{
		int age = 18;
		boolean pancard = true;
		boolean aadharCard = false;
		if(age >= 18)
		{	
			if((pancard == true) || (aadharCard == true))
			{
				System.out.println("Your Eligible to Create Bank Account");
			}
			else
			{
				System.out.println("Please bring either Pan Card/ Aadhar Card");
			}		
		}
		else
		{
			System.out.println("Your not eligible to Create Bank Account because of age criteria");
		}
	}	
}