import java.util.Scanner;

public class BankAccount {
	int balance;
	int previousTransactions;
	String customerName;
	String customerId;

	BankAccount(String cname, String cid)
	{
		customerName = cname;
		customerId = cid;
	}

	void deposit(int amount)
	{
		if(amount!=0)
		{
			balance =balance + amount;
			previousTransactions = amount;
		}
	}

	void withdraw(int amount)
	{
		if(amount!=0)
		{
			balance=balance - amount;
			previousTransactions = -amount;
		}
	}
	void getPreviousTransaction()
	{
		if(previousTransactions > 0)
		{
			System.out.println("Deposit: " + previousTransactions);
		}
		else if (previousTransactions < 0)
		{
			System.out.println("Withdrawn: " + Math.abs(previousTransactions));
		}
		else
		{
			System.out.println("No Transaction Occured");
		}
	}

	void showMenu()
	{
		char option= '\0';
		Scanner s= new Scanner(System.in);
		System.out.println("Welcome " + customerName);
		System.out.println("Your ID is: " + customerId);
		System.out.println("\n");
		System.out.println("A. Check Balance");
		System.out.println("B. Deposit");
		System.out.println("C. Witndrawnl");
		System.out.println("D. PreviousTransactions");
		System.out.println("E. Exit");

		do
		{
			System.out.println("---------------------");
			System.out.println("Enter an Option");
			System.out.println("---------------------");
			option = s.next().charAt(0);
			System.out.println("\n");


			switch(option)
			{
			case 'A':
				System.out.println("---------------------");
				System.out.println("Balance = " + balance);
				System.out.println("---------------------");
				System.out.println("\n");
				break;


			case 'B':
				System.out.println("---------------------");
				System.out.println("Enter an Amount to Deposit ");
				System.out.println("---------------------");
				int amount =s.nextInt();
				deposit(amount);
				System.out.println("\n");
				break;


			case 'C':
				System.out.println("---------------------");
				System.out.println("Enter an Amount to Withdraw ");
				System.out.println("---------------------");
				int amount2 =s.nextInt();
				withdraw(amount2);
				System.out.println("\n");
				break;

			case 'D':
				System.out.println("---------------------");
				getPreviousTransaction();
				System.out.println("---------------------");
				System.out.println("\n");
				break;


			case 'E':
				System.out.println("* * * * * * * * * *");
				break;

			default:
				System.out.println("Invalid Option !! Please Try Again..");

			}

		}while(option!= 'E');
		System.out.println("Thankyou for using our services!!");

		s.close();
	}


}
