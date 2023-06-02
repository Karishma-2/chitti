package controlflowStatements;

public class Bank {
	private float amount;
	private int bankId=12345;
	public void setAmount(int bankId,float amt)
	{
		if(this.bankId==bankId)
		{
			amount=amt;
		}
		else
		{
			System.out.println("Invalid bankId");
		}
	}
	public void getAmount(int bankId)
	{
		if(this.bankId==bankId)
			System.out.println("Account balance :"+amount);
		else System.out.println("Invalid BankId");
	}
	}












