
import java.util.Scanner;
/**
 * @author Jai Mata Di
 *
 */
public class ATM {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int choice, pin=8796;
		float balance=10000,amount;
		Scanner in=new Scanner(System.in);
		try
		{
		System.out.println("enter the pin");
		pin= in.nextInt();
		if(pin==8796)
		{	
			do
			{
		System.out .println("enter your choice");
		System.out .println("1.Withdrawl\n2.Balance Check\n3.Exit");
		choice=in.nextInt();
		
		switch (choice) 
		{
		case 1:
			System.out.println("enter your amount want to be withdraw");
			System.out.println("enter the amount");
			Scanner amt=new Scanner(System.in);
			amount=in.nextFloat();
			if( amount < balance )  
			{
				balance = balance-amount;
			}
			else
			{
				System.out.println("insufficient balance");
			}
			
		        System.out.println("Balance"+balance);
				amount=in.nextInt();
				
				     break;
		case 2:System.out.println("balance"+balance);
		
				break;
		
		case 3: System.exit(0);
		
		default : System.out .println("enter correct choice");	
		}
				
		} while(true);
	}
		else
		{
		System.out.println("wrong pin");
		}
	}
		catch(Exception e)
		{
			
				System.out.println("Incorrect PIN");
			
		}
		System.exit(0);
	}
}
