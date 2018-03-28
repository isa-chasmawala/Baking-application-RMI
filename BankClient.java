import java.util.*;
import java.rmi.*;
class BankClient
{
	public static void main(String args[])
	{
		int ac_no,amount,bal;
		Scanner sc=new Scanner(System.in);
		System.out.print("1.TO DEPOSIT \n2.TO WITHDRAW \n3.TO CHECK BALANCE \nEnter your choice:");
		try{
		BankIntf bi = (BankIntf)Naming.lookup("rmi://localhost:1099//BankImpl");
		int ch = sc.nextInt();
		switch(ch)
		{
			case 1: System.out.print("Enter ac_no:"); ac_no = sc.nextInt();
					System.out.print("Enter amount:"); amount = sc.nextInt();
					bi.deposit(ac_no,amount);
					System.out.println("Deposited"); break;
			case 2: System.out.print("Enter ac_no:"); ac_no = sc.nextInt();
					System.out.print("Enter amount:"); amount = sc.nextInt();
					bi.withdraw(ac_no,amount);
					System.out.println("Withdrawn"); break;
			case 3: System.out.print("Enter ac_no:");
					ac_no = sc.nextInt();
					bal = bi.view_bal(ac_no);
					System.out.print("Balance = "+ bal);
					break;
		}
	}
	catch(Exception e)
	{}
	}
}
